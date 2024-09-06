package irvine.oeis.a072;

import java.util.LinkedHashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072139 Last term of the preperiodic part of the 'Reverse and Subtract' trajectory of n, or -1 if the trajectory is completely periodic.
 * @author Sean A. Irvine
 */
public class A072139 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isZero()) {
      return Z.NEG_ONE;
    }
    Z t = mN;
    final LinkedHashSet<Z> seen = new LinkedHashSet<>();
    seen.add(t);
    while (seen.add(t = t.subtract(Functions.REVERSE.z(t)).abs())) {
      // do nothing
    }
    Z r = null;
    for (final Z v :seen) {
      if (v.equals(t)) {
        return r;
      }
      r = v;
    }
    throw new RuntimeException();
  }
}
