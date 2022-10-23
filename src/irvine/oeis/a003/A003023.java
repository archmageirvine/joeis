package irvine.oeis.a003;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003023 "Length" of aliquot sequence for n.
 * @author Sean A. Irvine
 */
public class A003023 extends Sequence1 {

  private Z mN = Z.ZERO;

  long aliquot(Z n) {
    if (n.compareTo(Z.ONE) <= 0) {
      return 0;
    }
    long step = 0;
    final HashSet<Z> seen = new HashSet<>(); // For cycle detection
    while (seen.add(n)) {
      if (n.isProbablePrime()) {
        return step + 1;
      }
      n = Jaguar.factor(n).sigma().subtract(n);
      ++step;
    }
    return step;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(aliquot(mN));
  }
}
