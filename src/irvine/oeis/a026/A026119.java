package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a000.A000016;

/**
 * A026119 Bisection of A000016 (also of A000013).
 * @author Sean A. Irvine
 */
public class A026119 extends A000016 {

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}
