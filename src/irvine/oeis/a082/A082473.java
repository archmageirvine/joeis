package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A082473 Numbers n such that n = phi(x)*core(x) for some x &lt;= n, where phi(x) is the Euler totient function and core(x) the squarefree part of x.
 * @author Sean A. Irvine
 */
public class A082473 extends Sequence1 {

  private static final int MAX_BIT_LENGTH = 36;
  private static final long MAX = 1L << MAX_BIT_LENGTH;
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN >= MAX) {
        throw new UnsupportedOperationException("Increase MAX_BIT_LENGTH");
      }
      final Z v = Functions.PHI.z(mN).multiply(Functions.CORE.l(mN));
      if (v.bitLength() < MAX_BIT_LENGTH) {
        mSeen.set(v.longValue());
      }
      if (mSeen.isSet(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

