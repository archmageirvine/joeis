package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.a000.A000979;

/**
 * A127962 Binary expansion of A000979(n).
 * @author Georg Fischer
 */
public class A127962 extends A000979 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}
