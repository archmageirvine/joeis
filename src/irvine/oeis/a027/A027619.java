package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a005.A005185;

/**
 * A027619 Numbers k such that Hofstadter Q-sequence Q(k) (A005185) satisfies Q(k) = k/2.
 * @author Sean A. Irvine
 */
public class A027619 extends A005185 {

  @Override
  public Z next() {
    while (!super.next().multiply2().equals(Z.valueOf(size() - 1))) {
      // do nothing
    }
    return Z.valueOf(size() - 1);
  }
}
