package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.MemoryFunction3;
import irvine.math.z.Z;

/**
 * A005941 Inverse of the Doudna sequence A005940.
 * @author Sean A. Irvine
 */
public class A005941 extends MemoryFunction2Sequence<Z, Z> {

  // After R. J. Mathar

  private long mN = 0;

  @Override
  protected Z compute(final Z n, final Z m) {
    return n.signum() == 0 ? m : get(n.divide2(), m.multiply2().add(n.and(Z.ONE)));
  }

  private static class GFunction extends MemoryFunction3<Z, Z> {

    private final Fast mPrime = new Fast();
    private final ArrayList<Long> mP = new ArrayList<>();
    {
      mP.add(null);
      mP.add(2L);
    }

    private long ithPrime(final Z ii) {
      final int i = ii.intValueExact();
      while (i >= mP.size()) {
        mP.add(mPrime.nextPrime(mP.get(mP.size() - 1)));
      }
      return mP.get(i);
    }

    @Override
    protected Z compute(final Z n, final Z i, final Z x) {
      if (Z.ONE.equals(n)) {
        return x;
      }
      if (n.mod(ithPrime(i)) == 0) {
        return get(n.divide(ithPrime(i)), i, x.multiply2().add(1));
      } else {
        return get(n, i.add(1), x.multiply2());
      }
    }
  }

  private final GFunction mG = new GFunction();

  @Override
  public Z next() {
    ++mN;
    return get(mG.get(Z.valueOf(mN), Z.ONE, Z.ONE), Z.ZERO).add(1).divide2();
  }
}
