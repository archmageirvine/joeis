package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a005.A005185;

/**
 * A027619 Numbers n such that Hofstadter <code>Q-sequence Q(n) (A005185)</code> satisfies <code>Q(n)=n/2</code>.
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
