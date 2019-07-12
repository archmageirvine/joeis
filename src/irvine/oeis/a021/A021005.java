package irvine.oeis.a021;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a037.A037074;

/**
 * A021005 Let <code>q_k=p(p+2)</code> be product of k-th pair of twin primes; sequence gives values of p such that <code>(q_k)^2 &gt; q_{k-i}q_{k+i}</code> for all <code>1 &lt;= i &lt;= k-1</code>.
 * @author Sean A. Irvine
 */
public class A021005 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A037074());
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z q2 = mA.a(++mN).square();
      boolean ok = true;
      for (int k = 1; k <= mN; ++k) {
        final Z v2 = mA.a(mN - k).multiply(mA.a(mN + k));
        if (q2.compareTo(v2) <= 0) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return mA.a(mN).sqrt();
      }
    }
  }
}

