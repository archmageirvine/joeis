package irvine.oeis.a105;
// manually build/simple1 at 2022-09-05 21:58

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A105814 a(n) = n^2 + (n concatenated with n).
 * @author Georg Fischer
 */
public class A105814 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    return n.square().add(new Z(n.toString() + n));
  }
}
