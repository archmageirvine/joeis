package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000230;

/**
 * A045881 Smallest of first string of exactly 2n-1 consecutive composite integers.
 * @author Sean A. Irvine
 */
public class A045881 extends A000230 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
