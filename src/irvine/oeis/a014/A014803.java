package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a015.A015226;

/**
 * A014803 Squares of even hexagonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A014803 extends A015226 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
