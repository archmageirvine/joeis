package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051213 Numbers of the form 2^x-y^2 &gt;= 0.
 * @author Sean A. Irvine
 */
public class A051213 implements Sequence {

  // Uses a heuristic, but any failure will be (eventually) detected

  private static final int HEURISTIC_STEPS = 5;
  private final TreeSet<Z> mDone = new TreeSet<>();
  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = -1;
  private Z mT = Z.ONE;
  {
    mA.add(Z.ZERO);
    mA.add(Z.ONE);
    // Prepopulate with initial terms
    step();
    step();
    step();
    step();
    step();
  }

  protected long base() {
    return 2;
  }

  private void step() {
    mT = mT.multiply(base());
    for (Z s, t = Z.ZERO; (s = t.square()).compareTo(mT) <= 0; t = t.add(1)) {
      final Z v = mT.subtract(s);
      if (mDone.isEmpty() || v.compareTo(mDone.last()) > 0) {
        mA.add(v);
      } else if (mDone.add(v)) {
        throw new RuntimeException("Heuristic failure on " + s + "-" + t + " = " + v);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN % HEURISTIC_STEPS == 0) {
      step();
    }
    final Z res = mA.pollFirst();
    mDone.add(res);
    return res;
  }
}
