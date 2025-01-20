package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A074264 Values of Kolakoski sequence A000002 at positions n = 0 mod 3.
 * @author Sean A. Irvine
 */
public class A074264 extends A000002 {

  @Override
  public Z next() {
    super.next();
    super.next();
    return super.next();
  }
}
