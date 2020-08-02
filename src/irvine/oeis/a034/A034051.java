package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034051 Numbers with multiplicative digital root value 4.
 * @author Sean A. Irvine
 */
public class A034051 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      while (m > 9) {
        m = ZUtils.digitProduct(m);
      }
      if (m == 4) {
        return Z.valueOf(mN);
      }
    }
  }
}

