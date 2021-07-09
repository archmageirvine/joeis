package irvine.oeis.a051;
// manually (bisect) 2021-07-05

import irvine.math.z.Z;

/**
 * A051847 Bisection of A051846, divided by the term position.
 * @author Georg Fischer
 */
public class A051847 extends A051846 {

  private int mN;

  /** Construct the sequence. */
  public A051847() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next().divide(mN);
    ++mN;
    super.next();
    return result;
  }
}
