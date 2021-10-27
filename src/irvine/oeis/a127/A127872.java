package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.a039.A039599;

/**
 * A127872 Triangle formed by reading A039599 mod 2. 
 * @author Georg Fischer
 */
public class A127872 extends A039599 {

  @Override
  public Z next() {
    return super.next().mod(Z.TWO);
  }
}
