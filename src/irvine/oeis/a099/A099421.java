package irvine.oeis.a099;
// manually dersimple at 2021-08-25 21:26

import irvine.math.z.Z;
import irvine.oeis.a056.A056664;

/**
 * A099421 0 together with numbers k such that 8*R_k - 7 is a prime, where R_k = 11...1 is the repunit (A002275) of length k.
 * @author Georg Fischer
 */
public class A099421 extends A056664 {

  private int mN = 0;
  
  @Override
  public Z next() {
    ++mN;
    return mN <= 1 ? Z.ZERO : super.next().add(1);
  }
}
