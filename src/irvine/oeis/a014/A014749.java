package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014749.
 * @author Sean A. Irvine
 */
public class A014749 extends A014468 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
