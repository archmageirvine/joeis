package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A061281.
 * @author Sean A. Irvine
 */
public class A061288 extends A000217 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
