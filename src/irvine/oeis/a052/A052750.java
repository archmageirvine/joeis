package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052750 a(n) = (2*n + 1)^(n - 1).
 * @author Georg Fischer
 */
public class A052750 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ONE : Z.valueOf(mN).multiply2().add(1).pow(mN - 1);
  }
}
