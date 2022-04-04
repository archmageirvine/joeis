package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001163 Stirling's formula: numerators of asymptotic series for Gamma function.
 * @author Sean A. Irvine
 */
public class A001163 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private final ArrayList<Q> mSeq = new ArrayList<>();

  protected Q nextQ() {
    if (++mN < 1) {
      mSeq.add(Q.ONE);
      mSeq.add(Q.ONE);
      return Q.ONE;
    }
    final int m = 2 * mN + 1;
    for (int k = mSeq.size(); k <= m; ++k) {
      Q t = mSeq.get(k - 1);
      for (int i = 2; i < k; ++i) {
        t = t.subtract(mSeq.get(i).multiply(mSeq.get(k + 1 - i)).multiply(i));
      }
      mSeq.add(t.divide(k + 1));
    }
    return mSeq.get(m).multiply(mF.factorial(m)).divide(mF.factorial(mN)).divide(Z.ONE.shiftLeft(mN));
  }

  @Override
  public Z next() {
    return nextQ().num();
  }
}
