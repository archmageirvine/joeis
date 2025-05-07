package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050529 Primes of the form 11*2^k + 1.
 * @author Sean A. Irvine
 */
public class A050529 extends Sequence1 {

  private Z mM = Z.valueOf(11);

  @Override
  public Z next() {
    while (true) {
      mM = mM.multiply2();
      final Z t = mM.add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
