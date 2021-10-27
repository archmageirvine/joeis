package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.a008.A008292;

/**
 * A090737 Triangle of Eulerian numbers modulo 3. 
 * @author Georg Fischer
 */
public class A090737 extends A008292 {

  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}
