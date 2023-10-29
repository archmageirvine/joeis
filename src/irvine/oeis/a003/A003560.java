package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003560 Least number m such that 4^m == +- 1 (mod 4n + 1).
 * @author Sean A. Irvine
 */
public class A003560 extends A003559 {

  private boolean mFirst = true;

  /** Construct the sequence. */
  public A003560() {
    super(4);
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next();
  }
}
