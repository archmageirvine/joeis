package irvine.oeis.a117;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A117403 a(n) = Sum_{k=0..floor(n/2)} 2^((n-2*k)*k) for n&gt;=0.
 * @author Georg Fischer
 */
public class A117403 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN / 2, k -> Z.ONE.shiftLeft((mN - 2 * k) * k));
  }
}
