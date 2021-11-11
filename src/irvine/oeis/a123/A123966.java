package irvine.oeis.a123;
// manually transpose at 2021-11-10 19:36

import irvine.math.z.Z;
import irvine.oeis.a124.A124029;

/**
 * A123966 Triangle A124029 with the (0, 0) entry replaced by 4.
 * @author Georg Fischer
 */
public class A123966 extends A124029 {

  protected long mN = -1;

  @Override
  public Z next() {
    final Z result = super.next();
    return ++mN == 0 ? Z.FOUR : result;
  }
}

