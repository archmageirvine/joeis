package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A051213 Numbers of the form 2^x-y^2 &gt;= 0.
 * @author Sean A. Irvine
 */
public class A051213 implements Sequence {

  // Uses a heuristic, but any failure will be (eventually) detected

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private static final int BIT_LIMIT = Integer.parseInt(System.getProperty("oeis.a051213.limit", "1000"));
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
    if (mVerbose) {
      StringUtils.message("Starting search for " + mT);
    }
    for (Z t = mT.sqrt(); t.signum() >= 0; t = t.subtract(1)) {
      final Z s = t.square();
      final Z v = mT.subtract(s);
      if (v.bitLength() > BIT_LIMIT) {
        break;
      }
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
    while (mA.isEmpty()) {
      step();
    }
    final Z res = mA.pollFirst();
    mDone.add(res);
    return res;
  }
}
