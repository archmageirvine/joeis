package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a052.A052709;

/**
 * A039981 An example of a d-perfect sequence.
 * @author Sean A. Irvine
 */
public class A039981 extends A052709 {

  {
    super.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}

