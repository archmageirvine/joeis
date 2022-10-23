package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A109795 a(n)= n*(1+floor(n/10)).
 * @author Georg Fischer
 */
public class A109795 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mN / 10 + 1);
  }
}
