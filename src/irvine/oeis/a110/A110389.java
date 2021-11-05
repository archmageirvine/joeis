package irvine.oeis.a110;
// manually deris2/essent 0 A005267 at 2021-11-04

import irvine.math.z.Z;
import irvine.oeis.a005.A005267;

/**
 * A110389 Integers with mutual residues -1.
 * Same as A005267 but with the first two terms in reverse order.
 * @author Georg Fischer
 */
public class A110389 extends A005267 {

  private int mN = 1;
  
  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    return mN <= 3 ? Z.valueOf(mN) : result;
  }
}
