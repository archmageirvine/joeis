package irvine.oeis.a336;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A336882 a(0) = 1; for k &gt;= 0, 0 &lt;= i &lt; 2^k, a(2^k + i) = m_k * a(i), where m_k is the least odd number not in terms 0..2^k - 1.
 * @author Sean A. Irvine
 */
public class A336882 extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private final List<Z> mFutureForbidden = new ArrayList<>();
  private int mM = 1;
  private int mLimit = 2;
  private Z mLeast = Z.ONE;

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      mForbidden.add(Z.ONE);
      return Z.ONE;
    }
    if (n == mLimit) {
      mForbidden.addAll(mFutureForbidden);
      mFutureForbidden.clear();
      mM = mLimit;
      mLimit *= 2;
    }
    while (mForbidden.remove(mLeast)) {
      mLeast = mLeast.add(2);
    }
    final int i = n - mM;
    final Z res = a(i).multiply(mLeast);
    mFutureForbidden.add(res);
    return res;
  }
}
