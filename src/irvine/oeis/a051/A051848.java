package irvine.oeis.a051;
// manually (bisect) 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a023.A023811;

/**
 * A051848 Bisection of A023811, divided by the term position.
 * @author Georg Fischer
 */
public class A051848 extends A023811 {
  
  private int mN;

  /** Construct the sequence. */
  public A051848() {
    mN = 0;
    super.next();
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
