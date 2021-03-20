package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045751 Numbers k such that 4*k + 1 is not prime.
 * @author Sean A. Irvine
 */
public class A045751 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (Z.valueOf(4 * ++mN + 1).isProbablePrime()) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
