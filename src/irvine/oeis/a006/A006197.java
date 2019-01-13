package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000984;

/**
 * A006197.
 * @author Sean A. Irvine
 */
public class A006197 extends A000984 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z a = super.next();
    long k = 1;
    while (a.mod(++k) == 0) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
