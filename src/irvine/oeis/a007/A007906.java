package irvine.oeis.a007;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007906 Number of steps for aliquot sequence for n to converge to 0, or <code>-1</code> if it never reaches 0.
 * @author Sean A. Irvine
 */
public class A007906 implements Sequence {

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
      n = Jaguar.factor(n).sigma().subtract(n);
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
