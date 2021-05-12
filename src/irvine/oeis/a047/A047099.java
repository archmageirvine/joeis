package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047099 A047098(n)/2.
 * @author Sean A. Irvine
 */
public class A047099 extends A047098 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
