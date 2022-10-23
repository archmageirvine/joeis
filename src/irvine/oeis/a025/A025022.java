package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025022 Numbers whose least quadratic nonresidue (A020649) is 5.
 * @author Sean A. Irvine
 */
public class A025022 extends Sequence1 {

  private long mN = 22;

  @Override
  public Z next() {
    while (true) {
      if (A025021.isResidue(2, ++mN) && A025021.isResidue(3, mN) && !A025021.isResidue(5, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
