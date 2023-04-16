package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066279 a(n) = n^n + n + 1.
 * @author Georg Fischer
 */
public class A066279 extends Sequence0 {

  private long mN = -2;

  @Override
  public Z next() {
    ++mN;
    return (mN == -1) ? Z.NEG_ONE : Z.valueOf(mN).pow(mN).add(mN + 1);
  }
}
