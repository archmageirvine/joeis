package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053506 a(n) = (n-1)*n^(n-2).
 * @author Sean A. Irvine
 */
public class A053506 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN - 2).multiply(mN - 1);
  }
}

