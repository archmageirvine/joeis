package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050529 Primes of form 11*2^n+1.
 * @author Sean A. Irvine
 */
public class A050529 implements Sequence {

  private Z mM = Z.valueOf(11);

  @Override
  public Z next() {
    while (true) {
      mM = mM.shiftLeft(1);
      final Z t = mM.add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
