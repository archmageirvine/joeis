package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a014.A014413;

/**
 * A028330 Elements to the right of the central elements of the even-Pascal triangle <code>A028326</code>.
 * @author Sean A. Irvine
 */
public class A028330 extends A014413 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
