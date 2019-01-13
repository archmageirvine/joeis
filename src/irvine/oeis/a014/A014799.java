package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a015.A015223;

/**
 * A014799.
 * @author Sean A. Irvine
 */
public class A014799 extends A015223 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
