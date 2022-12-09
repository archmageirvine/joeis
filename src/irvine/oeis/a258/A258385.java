package irvine.oeis.a258;
// manually anopan 

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A258385 a(n) = n^(n+1) * (n-1)^n.
 * @author Georg Fischer
 */
public class A258385 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN + 1).multiply(Z.valueOf(mN - 1).pow(mN));
  }
}
