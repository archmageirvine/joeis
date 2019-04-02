package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a015.A015222;

/**
 * A014798 Squares of even square pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A014798 extends A015222 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
