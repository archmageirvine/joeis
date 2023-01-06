package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a036.A036691;

/**
 * A060880 Compositorial numbers (A036691) - 1.
 * @author Sean A. Irvine
 */
public class A060880 extends A036691 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
