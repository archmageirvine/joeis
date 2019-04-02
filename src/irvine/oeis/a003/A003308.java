package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003308 2*n^(n-2).
 * @author Sean A. Irvine
 */
public class A003308 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN - 2).multiply2();
  }

}
