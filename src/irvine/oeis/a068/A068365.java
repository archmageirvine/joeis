package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A068365 Numbers k such that sigma(k) = phi((prime(k)+prime(k+1))/2).
 * @author Sean A. Irvine
 */
public class A068365 extends Sequence1 {

  private final Sequence mA = new A000040().skip(); // skip 2
  private Z mP = mA.next();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      mP = mA.next();
      if (Euler.phi(q.add(mP).divide2()).equals(Jaguar.factor(++mN).sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}

