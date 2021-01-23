package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025023 Numbers whose least quadratic nonresidue (A020649) is 7.
 * @author Sean A. Irvine
 */
public class A025023 implements Sequence {

  private long mN = 70;

  @Override
  public Z next() {
    while (true) {
      if (A025021.isResidue(2, ++mN) && A025021.isResidue(3, mN) && A025021.isResidue(5, mN) && !A025021.isResidue(7, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
