package irvine.oeis.a007;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007906 Number of steps for aliquot sequence for n to converge to 0, or -1 if it never reaches 0.
 * @author Sean A. Irvine
 */
public class A007906 extends Sequence1 {

  private Z mN = Z.ZERO;

  private long aliquot(Z n) {
    if (n.compareTo(Z.ONE) <= 0) {
      return 1;
    }
    long step = 0;
    final HashSet<Z> seen = new HashSet<>(); // For cycle detection
    while (seen.add(n)) {
      if (n.isProbablePrime()) {
        return step + 2;
      }
      n = Functions.SIGMA1.z(n).subtract(n);
      ++step;
    }
    return -1;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(aliquot(mN));
  }
}
