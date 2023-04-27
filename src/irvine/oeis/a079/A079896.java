package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079896 Discriminants of indefinite binary quadratic forms.
 * @author Sean A. Irvine
 */
public class A079896 extends Sequence1 {

  private Z mN = Z.FOUR;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final long r = mN.mod(4);
      if (r == 2 || r == 3) {
        continue;
      }
      mN.sqrt();
      if (mN.auxiliary() == 0) {
        return mN;
      }
    }
  }
}
