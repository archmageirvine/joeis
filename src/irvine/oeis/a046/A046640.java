package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a045.A045763;

/**
 * A046640 a(n) = A045763(n) + 1.
 * @author Sean A. Irvine
 */
public class A046640 extends A045763 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
