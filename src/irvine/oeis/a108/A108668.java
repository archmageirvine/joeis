package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A108668.
 * @author Sean A. Irvine
 */
public class A108668 implements Sequence {

  private static final int START = 0x10;
  private static final int INVISIBLE = 0x20;
  private static final int SHIFT_POS = 10000000;

  private long mN = -1;
  private int mScanPos = 0;
  private int mSkipPos = 1;
  private int mLen = 2;
  private final byte[] mConcat = new byte[2 * SHIFT_POS];
  {
    mConcat[0] = (byte) START;
    mConcat[1] = (byte) (INVISIBLE + START + 1);
  }

  private void install(final long n) {
    final String m = String.valueOf(n);
    mConcat[mLen++] = (byte) (START + m.charAt(0) - '0');
    for (int k = 1; k < m.length(); ++k) {
      mConcat[mLen++] = (byte) (m.charAt(k) - '0');
    }
  }

  private int nextVisible(final int p) {
    int t = p + 1;
    while ((mConcat[t] & INVISIBLE) != 0) {
      ++t;
    }
    return t;
  }

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 1;
      return Z.ZERO;
    }
    if (mN > 10000000000L) {
      return null;
    }
    while (true) {
      if (mScanPos > SHIFT_POS) {
        // Shunt everything down in RAM to save space
        System.arraycopy(mConcat, SHIFT_POS, mConcat, 0, mLen - SHIFT_POS);
        mScanPos -= SHIFT_POS;
        mSkipPos -= SHIFT_POS;
        mLen -= SHIFT_POS;
      }

      while (mSkipPos < mScanPos + 100) {
        while (mSkipPos + 200 >= mLen) {
          install(++mN);
        }
        if (mN > 10000000000L) {
          return null;
        }
        int skip = mConcat[++mSkipPos];
        if (skip < INVISIBLE) {
          skip &= 0xF;
          int t = nextVisible(mSkipPos);
          while (skip-- > 0) {
            t = nextVisible(t);
          }
          mConcat[t] += (byte) INVISIBLE;
        }
      }

      if ((mConcat[mScanPos++] & INVISIBLE) != 0
        && (mConcat[mScanPos] & (INVISIBLE | START)) == START) {
        boolean ok = true;
        int c;
        int q = mScanPos;
        while (((c = mConcat[++q]) & START) == 0) {
          if ((c & INVISIBLE) != 0) {
            ok = false;
            break;
          }
        }
        if (ok && (c & INVISIBLE) != 0) {
          long s = mConcat[mScanPos] & 0xF;
          while (((c = mConcat[++mScanPos]) & START) == 0) {
            s *= 10;
            s += c;
          }
          --mScanPos;
          return Z.valueOf(s);
        } else {
          mScanPos = q - 1;
        }
      }
    }
  }
}

