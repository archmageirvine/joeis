package irvine.oeis.a121;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A121520 a(n) = (10^n+1)^n.
 * @author Georg Fischer
 */
public class A121520 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.TEN.pow(mN).add(1).pow(mN);
  }
}
