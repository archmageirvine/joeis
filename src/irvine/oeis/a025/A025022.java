package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025022 Least <code>non-residue mod n</code> is 5.
 * @author Sean A. Irvine
 */
public class A025022 implements Sequence {

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
