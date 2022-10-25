package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a100.A100223;

/**
 * A039976 An example of a d-perfect sequence.
 * @author Sean A. Irvine
 */
public class A039976 extends A100223 {

  {
    setOffset(1);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}

