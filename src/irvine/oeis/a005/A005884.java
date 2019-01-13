package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a045.A045828;

/**
 * A005884.
 * @author Sean A. Irvine
 */
public class A005884 extends A045828 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
