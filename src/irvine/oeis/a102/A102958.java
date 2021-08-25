package irvine.oeis.a102;
// manually dersimple at 2021-08-25 21:26

import irvine.math.z.Z;
import irvine.oeis.a101.A101967;

/**
 * A102958 Numbers n such that 2*10^n + 7*R_n - 4 is prime, where R_n = 11...1 is the repunit (A002275) of length n.
 * @author Georg Fischer
 */
public class A102958 extends A101967 {

  private int mN = 0;
  
  @Override
  public Z next() {
    ++mN;
    return mN <= 1 ? Z.ZERO : super.next().add(1);
  }
}
