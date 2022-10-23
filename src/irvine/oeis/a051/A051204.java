package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051204 Nonnegative numbers of the form x^2-2^y.
 * @author Sean A. Irvine
 */
public class A051204 extends Sequence1 {

  // Uses a heuristic, but any failure will be (eventually) detected

  private static final int HEURISTIC_STEPS = 100;
  private final TreeSet<Z> mDone = new TreeSet<>();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ZERO;
  {
    mA.add(Z.ZERO);
  }

  protected long base() {
    return 2;
  }

  private void step() {
    mN = mN.add(1);
    final Z s = mN.square();
    for (Z t = Z.ONE; t.compareTo(s) <= 0; t = t.multiply(base())) {
      final Z v = s.subtract(t);
      if (mDone.isEmpty() || v.compareTo(mDone.last()) > 0) {
        mA.add(v);
      } else if (mDone.add(v)) {
        throw new RuntimeException("Heuristic failure on " + s + "-" + t + " = " + v);
      }
    }
  }

  @Override
  public Z next() {
    for (int k = 0; k < HEURISTIC_STEPS; ++k) {
      step();
    }
    final Z res = mA.pollFirst();
    mDone.add(res);
    return res;
  }
}
