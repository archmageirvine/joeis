package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030143 Even numbers in which parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030143 extends Sequence1 {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (A030141.isOk(mN)) {
        return mN;
      }
    }
  }
}
