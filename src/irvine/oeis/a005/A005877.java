package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a045.A045828;

/**
 * A005877 Theta series of cubic lattice with respect to square.
 * @author Sean A. Irvine
 */
public class A005877 extends A045828 {

  @Override
  public Z next() {
    return super.next().multiply(4);
  }
}
