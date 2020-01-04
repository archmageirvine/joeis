package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a014.A014413;

/**
 * A028330.
 * @author Sean A. Irvine
 */
public class A028330 extends A014413 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
