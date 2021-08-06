package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a036.A036691;

/**
 * A049650 Compositorial numbers (A036691) + 1.
 * @author Sean A. Irvine
 */
public class A049650 extends A036691 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
