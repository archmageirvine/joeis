package irvine.oeis.a095;

import irvine.math.z.Z;
import irvine.oeis.a004.A004001;

/**
 * A095901 A004001 (mod 2).
 * @author Georg Fischer
 */
public class A095901 extends A004001 {

  @Override
  public Z next() {
    return super.next().mod(Z.TWO);
  }
}
