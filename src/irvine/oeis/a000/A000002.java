package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A000002 Kolakoski sequence: a(n) is length of n-th run; a(1) = 1; sequence consists just of 1's and 2's.
 * @author Sean A. Irvine
 */
public class A000002 implements Sequence {

  protected long mN = -1;
  private LongDynamicIntArray mSeq = new LongDynamicIntArray();
  protected long mLimit = 2;

  protected void rewrite() {
    // Rewrite entire sequence.  There are probably much more space
    // efficient solutions for this, but this should enable us to get
    // lots of sequence reasonably quickly.  Uses single bits to
    // represent sequence 0 = '1', 1 = '2'.
    final LongDynamicIntArray newArray = new LongDynamicIntArray();
    long p = 0;
    long limit = 0;
    int w = 0;
    long q = 0;
    int used = 0;
    for (long k = 0, j = 0, i = 0; j < mLimit; j += 2, --i) {
      if (i == 0) {
        w = mSeq.get(k++);
        i = 16; // number of pairs left in word
      }
      switch (w & 3) {
      case 0:
        q += 1L << used;
        used += 2;
        limit += 2;
        break;
      case 1:
        q += 3L << used;
        used += 3;
        limit += 3;
        break;
      case 2:
        q += 1L << used;
        used += 3;
        limit += 3;
        break;
      default: // i.e. 3
        q += 3L << used;
        used += 4;
        limit += 4;
        break;
      }
      if (used >= 32) {
        newArray.set(p++, (int) q);
        q >>>= 32;
        used -= 32;
      }
      w >>>= 2;
    }
    newArray.set(p, (int) q);
    mSeq = newArray;
    mLimit = limit;
  }

  @Override
  public Z next() {
    // Generation by method of Lagarias
    if (++mN == 0) {
      mSeq.set(0, 3);
      return Z.ONE;
    }
    if (mN >= mLimit) {
      rewrite();
    }
    final long m = mN - 1;
    final int b = mSeq.get(m >>> 5);
    final int w = b & (1 << (m & 31));
    return w == 0 ? Z.ONE : Z.TWO;
  }

}

