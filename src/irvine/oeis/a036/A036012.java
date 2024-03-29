package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A036012 a(n) = smallest number &gt; 1 such that a(1)a(2)...a(n) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A036012 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A036012(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A036012() {
    super(1);
  }

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    long k = 1;
    while (true) {
      final Z t = mA.multiply(++k);
      if (t.add(1).isProbablePrime()) {
        mA = t;
        return Z.valueOf(k);
      }
    }
  }
}

