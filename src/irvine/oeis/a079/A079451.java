package irvine.oeis.a079;
// manually knest/jaguar at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A079451 Highest prime dividing the n-th Lucas number (A000032); 0 when no such prime exists.
 * @author Georg Fischer
 */
public class A079451 extends A000032 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z t = super.next();
    return (++mN == 1) ? Z.ZERO : Jaguar.factor(t).largestPrimeFactor();
  }
}
