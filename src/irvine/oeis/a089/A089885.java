package irvine.oeis.a089;

import irvine.math.z.Z;
import irvine.oeis.a046.A046899;

/**
 * A089885 Triangle A046899 read mod 2. 
 * @author Georg Fischer
 */
public class A089885 extends A046899 {

  @Override
  public Z next() {
    return super.next().mod(Z.TWO);
  }
}
