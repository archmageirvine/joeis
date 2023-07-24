package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.memory.MemorySequence;

/**
 * A064714 Define q(0)=1, q(1)=1, q(2)=1, q(n)=q(abs(n-q(n-2)))+q(abs(n-q(n-3))) (A063892); then a(0) = 1, a(n)=a(n-1)+2*(q(n)-n/2), n &gt; 0.
 * @author Sean A. Irvine
 */
public class A064714 extends Sequence0 {

  private Z mA = null;
  private long mN = 0;

  private final Sequence mPseudoA063892 = new MemorySequence() {
    // Infinite version of A063892
    @Override
    protected Z computeNext() {
      final int n = size();
      if (n <= 2) {
        return Z.ONE;
      }
      return a(Math.abs(n - a(n - 2).intValueExact())).add(a(Math.abs(n - a(n - 3).intValueExact())));
    }
  };

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      mPseudoA063892.next();
    } else {
      mA = mA.add(mPseudoA063892.next().multiply2().subtract(++mN));
    }
    return mA;
  }
}

