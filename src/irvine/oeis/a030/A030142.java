package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030142 Odd numbers in which parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030142 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

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
