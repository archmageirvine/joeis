package irvine.oeis.a391;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015921.
 * @author Sean A. Irvine
 */
public class A391828 extends Sequence1 {

  private long mN = 3;

  private boolean is(final long m) {
    Z n = Z.valueOf(m);
    final HashSet<Z> seen = new HashSet<>();
    seen.add(n);
    while (true) {
      n = Functions.ARD.z(n);
      if (!seen.add(n)) {
        return true;
      }
      if (!n.testBit(0) && !n.testBit(1)) {
        return false;
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
