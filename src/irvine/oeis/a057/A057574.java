package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A057574 Maximal numbers of codewords in mixed code with n binary coordinates and 1 ternary coordinate with Hamming distance 3.
 * @author Sean A. Irvine
 */
public class A057574 extends Sequence0 {

  private static final class Codeword {
    private final long mBinary;
    private final long mTernary;

    private Codeword(final long binary, final long ternary) {
      mBinary = binary;
      mTernary = ternary;
    }

//    private int hammingDistance(final Codeword other) {
//      int d = Long.bitCount(mBinary ^ other.mBinary);
//      long a = mTernary;
//      long b = other.mTernary;
//      while (a != 0 || b != 0) {
//        if ((a & 3) != (b & 3)) {
//          ++d;
//        }
//        a >>>= 2;
//        b >>>= 2;
//      }
//      return d;
//    }

    private boolean isHamming(final Codeword other, final int minDistance) {
      int d = Long.bitCount(mBinary ^ other.mBinary);
      if (d >= minDistance) {
        return true;
      }
      long a = mTernary;
      long b = other.mTernary;
      while (a != 0 || b != 0) {
        if ((a & 3) != (b & 3) && ++d >= minDistance) {
          return true;
        }
        a >>>= 2;
        b >>>= 2;
      }
      return false;
    }

    private Codeword next(final int binaryCoordinates, final int ternaryCoordinates) {
      final long limBinary = 1L << binaryCoordinates;
      if (mBinary + 1 < limBinary) {
        return new Codeword(mBinary + 1, mTernary);
      }
      long lim = 2;
      long step = 1;
      long mask = 3;
      long t = mTernary;
      for (int k = 0; k < ternaryCoordinates; ++k) {
        if ((t & mask) < lim) {
          return new Codeword(0, t + step);
        }
        t -= lim;
        lim <<= 2;
        step <<= 2;
        mask <<= 2;
      }
      return null;
    }

    private String toString(final int binaryCoordinates, final int ternaryCoordinates) {
      final StringBuilder sb = new StringBuilder();
      long a = mBinary;
      for (int k = 0; k < binaryCoordinates; ++k) {
        sb.append(a & 1);
        a >>>= 1;
      }
      sb.append(':');
       long b = mTernary;
      for (int k = 0; k < ternaryCoordinates; ++k) {
        sb.append(b & 3);
        b >>>= 2;
      }
      return sb.toString();
    }

  }

  private static final int MAX = 1000;

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Codeword[] mCodewords = new Codeword[MAX];
  private int mN = -1;
  protected long mBest = 0;

  private boolean isHammingOk(final int distance, final Codeword codeword, final int pos) {
    for (int k = pos - 1; k >= 0; --k) {
      if (!codeword.isHamming(mCodewords[k], distance)) {
        return false;
      }
    }
    return true;
  }


  protected void a(final int binaryCoordinates, final int ternaryCoordinates, final int distance, final Codeword codeword, final int pos) {
    if (pos > mBest) {
      mBest = pos;
      if (mVerbose) {
        StringUtils.message("b=" + binaryCoordinates + " t=" + ternaryCoordinates + " max is now " + mBest);
      }
//      for (int k = 0; k < pos; ++k) {
//        System.out.println(k + " " + mCodewords[k].toString(binaryCoordinates, ternaryCoordinates));
//      }
    }
    Codeword c = codeword;
    while ((c = c.next(binaryCoordinates, ternaryCoordinates)) != null) {
      if (isHammingOk(distance, c, pos)) {
        mCodewords[pos] = c;
        a(binaryCoordinates, ternaryCoordinates, distance, c, pos + 1);
      }
    }
  }

  protected Codeword reset() {
    mBest = 0;
    mCodewords[0] = new Codeword(0, 0);
    return mCodewords[0];
  }

  @Override
  public Z next() {
    a(++mN, 1, 3, reset(), 1);
    return Z.valueOf(mBest);
  }
}
