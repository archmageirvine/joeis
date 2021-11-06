package irvine.oeis.a052;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A052330 Let S_k denote the first 2^k terms of this sequence and let b_k be the smallest positive integer that is not in S_k; then the numbers b_k*S_k are the next 2^k terms.
 * @author Sean A. Irvine
 */
public class A052330 extends MemorySequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mB = Z.ONE;
  private int mM = 0;

  @Override
  protected Z computeNext() {
    if (mSeen.isEmpty()) {
      mSeen.add(Z.ONE);
      return Z.ONE;
    }
    final int n = mSeen.size();
    if ((n & (n - 1)) == 0) {
      while (mSeen.contains(mB)) {
        mB = mB.add(1);
      }
      mM = 0;
    }
    final Z t = get(mM++).multiply(mB);
    mSeen.add(t);
    return t;
  }
}
