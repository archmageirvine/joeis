package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A034055 Numbers with multiplicative digital root value 8.
 * @author Sean A. Irvine
 */
public class A034055 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m > 9) {
        m = ZUtils.digitProduct(m);
      }
      if (m == 8) {
        return Z.valueOf(mN);
      }
    }
  }
}

