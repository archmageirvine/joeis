package irvine.oeis.a139;
// Generated by gen_seq4.pl knest/jaguar at 2023-03-01 20:54

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A139131 Squarefree kernel of n*(n+1)/2.
 * @author Georg Fischer
 */
public class A139131 extends A000217 {

  /** Construct the sequence. */
  public A139131() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).squareFreeKernel();
  }
}
