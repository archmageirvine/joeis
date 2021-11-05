package irvine.oeis.a167;
// manually deris2/essent 0 A003319 at 2021-11-04 15:02
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a003.A003319;

/**
 * A167894 Expansion of g.f.: 1/(Sum_{k &gt;= 0} k!*x^k).
 * Essentially the same as A003319, which is the main entry for these numbers.
 * @author Georg Fischer
 */
public class A167894 extends A003319 {

  private int mN = 0;
  
  /** Construct the sequence. */
  public A167894() {
    super.next();
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ONE : super.next().negate();
  }
}
