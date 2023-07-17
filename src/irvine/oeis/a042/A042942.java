package irvine.oeis.a042;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A042942 From substitutional generation of Kolakoski sequence (A000002).
 * @author Sean A. Irvine
 */
public class A042942 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A042942(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A042942() {
    super(1);
  }

  protected long mN = -1;
  protected LongDynamicIntArray mSeq = new LongDynamicIntArray();
  protected long mLimit = 1;

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
          if (j == mLimit - 1) {
            // i.e. trailing "1"
            used += 1;
            limit += 1;
          } else {
            used += 2;
            limit += 2;
          }
          break;
        case 1:
          q += 3L << used;
          if (j == mLimit - 1) {
            // i.e. trailing "2"
            used += 2;
            limit += 2;
          } else {
            used += 3;
            limit += 3;
          }
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
    if (++mN == 0) {
      mSeq.set(0, 1);
      return Z.ONE;
    }
    rewrite();
    return Z.valueOf(mLimit);
  }
}
