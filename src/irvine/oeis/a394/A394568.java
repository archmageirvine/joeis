package irvine.oeis.a394;

import java.util.Set;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394568 allocated for Miles Englezou.
 * @author Sean A. Irvine
 */
public class A394568 extends Sequence1 {

  private long mN = 269484031;

  private boolean is(final long n) {
    final Set<Z> invPhi = InverseEuler.inversePhi(n);
    if (invPhi.isEmpty()) {
      return false;
    }
    for (final Z v : invPhi) {
      if (InverseEuler.inversePhi(v).isEmpty()) {
        return false;
      }
    }
    return true;
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
