package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030143 Even numbers in which parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030143 implements Sequence {

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
