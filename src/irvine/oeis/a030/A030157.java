package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030157 Even numbers n such that in <code>n^2</code> the parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030157 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (A030141.isOk(mN.square())) {
        return mN;
      }
    }
  }
}
