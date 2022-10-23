package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A034052 Numbers with multiplicative digital root value 5.
 * @author Sean A. Irvine
 */
public class A034052 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m > 9) {
        m = ZUtils.digitProduct(m);
      }
      if (m == 5) {
        return Z.valueOf(mN);
      }
    }
  }
}

