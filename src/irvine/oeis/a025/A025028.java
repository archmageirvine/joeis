package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025028 Numbers whose least quadratic nonresidue (A020649) is 23.
 * @author Sean A. Irvine
 */
public class A025028 implements Sequence {

  private long mN = 10558;

  @Override
  public Z next() {
    while (true) {
      if (A025021.isResidue(2, ++mN) && A025021.isResidue(3, mN) && A025021.isResidue(5, mN)
        && A025021.isResidue(7, mN) && A025021.isResidue(11, mN) && A025021.isResidue(13, mN)
        && A025021.isResidue(17, mN) && A025021.isResidue(19, mN) && !A025021.isResidue(23, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
