package irvine.oeis.a003;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003062.
 * @author Sean A. Irvine
 */
public class A003062 implements Sequence {

  private Z mN = Z.ZERO;

  private boolean isUnitaryAliquotRepeat(Z n) {
    if (n.compareTo(Z.ONE) <= 0) {
      return false;
    }
    final HashSet<Z> seen = new HashSet<>(); // For cycle detection
    while (seen.add(n)) {
      if (n.isProbablePrime()) {
        return false;
      }
      n = Jaguar.factor(n).unitaryDivisorSum();
      if (n.compareTo(Z.ONE) <= 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isUnitaryAliquotRepeat(mN)) {
        return mN;
      }
    }
  }
}
