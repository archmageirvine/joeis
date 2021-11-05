package irvine.oeis.a173;
// manually deris2/essent at 2021-11-04

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A173905 {2,3} and the nonprimes A141468.
 * Essentially the same as A002808, A141468, A018252, A065090, A171581 and A056653.
 * @author Georg Fischer
 */
public class A173905 extends A002808 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN <= 3 ? Z.valueOf(mN) : super.next();
  }
}
