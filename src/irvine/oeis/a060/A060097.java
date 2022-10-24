package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060097.
 * @author Sean A. Irvine
 */
public class A060097 extends A060096 {

  @Override
  public Z next() {
    return nextQ().den();
  }
}
