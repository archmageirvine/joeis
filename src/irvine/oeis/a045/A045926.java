package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a084.A084544;

/**
 * A045926 All digits even and nonzero.
 * @author Sean A. Irvine
 */
public class A045926 extends A084544 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
