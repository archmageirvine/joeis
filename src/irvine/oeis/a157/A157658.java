package irvine.oeis.a157;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A157658 a(1) = 0, a(n) = -mu(n) for n &gt;= 2.
 * @author Georg Fischer
 */
public class A157658 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return mN == 1 ? Z.ZERO : Z.valueOf(-Mobius.mobius(mN));
  }
}
