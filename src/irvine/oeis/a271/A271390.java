package irvine.oeis.a271;
// manually loda at 2023-04-15 11:40

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A271390 a(n) = (2*n + 1)^(2*floor((n-1)/2) + 1).
 * @author Georg Fischer
 */
public class A271390 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(2 * mN + 1).pow(2 * ((mN - 1) / 2) + 1);
  }
}
