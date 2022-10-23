package irvine.oeis.a338;
// manually 2021-09-25

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A338112 Least number that is both the sum and product of n distinct positive integers.
 * @author Georg Fischer
 */
public class A338112 extends A000142 {

  protected int mN;

  /** Construct the sequence. */
  public A338112() {
    setOffset(1);
    mN = 0;
    super.next(); // skip 0! = 1
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().add(mN == 2 ? 1 : 0);
  }
}
