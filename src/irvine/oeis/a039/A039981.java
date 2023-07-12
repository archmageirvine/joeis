package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a052.A052709;

/**
 * A039981 An example of a d-perfect sequence.
 * @author Sean A. Irvine
 */
public class A039981 extends A052709 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}

