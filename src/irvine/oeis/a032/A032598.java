package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A032598 Squares of lucky numbers.
 * @author Sean A. Irvine
 */
public class A032598 extends A000959 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
