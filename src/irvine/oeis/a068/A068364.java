package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A068364 Primes p such that there exists k such that p = prime(k) + prime(k+2) + prime(k+4) + prime(k+6) + prime(k+8).
 * @author Sean A. Irvine
 */
public class A068364 extends Sequence1 {

  private final Sequence mA = new A000040();
  private final Sequence mB = new A000040().skip(2);
  private final Sequence mC = new A000040().skip(4);
  private final Sequence mD = new A000040().skip(6);
  private final Sequence mE = new A000040().skip(8);

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next().add(mB.next()).add(mC.next()).add(mD.next()).add(mE.next());
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

