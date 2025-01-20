package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A074265 Values of Kolakoski sequence A000002 at positions n = 0 mod 5.
 * @author Sean A. Irvine
 */
public class A074265 extends A000002 {

  @Override
  public Z next() {
    super.next();
    super.next();
    super.next();
    super.next();
    return super.next();
  }
}
