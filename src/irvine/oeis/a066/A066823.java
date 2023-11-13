package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a035.A035506;

/**
 * A066823 Primes in the main diagonal of the Stolarsky array (cf. A035506).
 * @author Sean A. Irvine
 */
public class A066823 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = A035506.stolarsky(++mN, mN);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

