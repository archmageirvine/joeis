package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a015.A015221;

/**
 * A014797 Squares of odd square pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A014797 extends A015221 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
