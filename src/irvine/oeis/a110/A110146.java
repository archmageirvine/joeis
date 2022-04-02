package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A110146 n^(n+1) mod n+2.
 * @author Georg Fischer
 */
public class A110146 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN + 1).mod(Z.valueOf(mN + 2));
  }
}
