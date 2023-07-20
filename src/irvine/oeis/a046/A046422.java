package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.prime.HomePrimeSequence;
import irvine.oeis.a002.A002808;

/**
 * A046422 Numbers requiring 2 steps to reach a prime under the prime factor concatenation procedure.
 * @author Sean A. Irvine
 */
public class A046422 extends A002808 {

  protected long target() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final HomePrimeSequence hp = new HomePrimeSequence(n.longValueExact());
      long c = -1;
      while (hp.next() != null) {
        if (++c > target()) {
          break;
        }
      }
      if (c == target()) {
        return n;
      }
    }
  }
}

