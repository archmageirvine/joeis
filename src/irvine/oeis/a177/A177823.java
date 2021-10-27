package irvine.oeis.a177;

import irvine.math.z.Z;
import irvine.oeis.a008.A008292;

/**
 * A177823 Triangle of Eulerian numbers squared: A008292(n,m)^2 read by rows. 
 * @author Georg Fischer
 */
public class A177823 extends A008292 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
