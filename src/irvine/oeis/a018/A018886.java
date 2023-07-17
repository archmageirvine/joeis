package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a002.A002379;

/**
 * A018886 Waring's problem: least positive integer requiring maximum number of terms when expressed as a sum of positive n-th powers.
 * @author Sean A. Irvine
 */
public class A018886 extends A002379 {

  /** Construct the sequence. */
  public A018886() {
    super(1);
  }

  {
    super.next(); // skip 0th
  }

  @Override
  public Z next() {
    return super.next().shiftLeft(mN).subtract(1);
  }
}
