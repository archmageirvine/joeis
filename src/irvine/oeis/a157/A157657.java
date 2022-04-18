package irvine.oeis.a157;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A157657 a(1) = 1, a(n) = -mu(n) for n &gt;= 2.
 * @author Georg Fischer
 */
public class A157657 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return mN == 1 ? Z.ONE : Z.valueOf(-Mobius.mobius(mN));
  }
}
