package irvine.oeis.a082;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082909 a(n) = Sum_{d|n} (d mod 3).
 * @author Georg Fischer
 */
public class A082909 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(d % 3));
  }
}
