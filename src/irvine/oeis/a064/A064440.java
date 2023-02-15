package irvine.oeis.a064;
// manually prisuba at 2023-02-14 11:49

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a048.A048138;

/**
 * A064440 Numbers k such that A048138(k) is a prime and sets a new record for such primes.
 * @author Georg Fischer
 */
public class A064440 extends Sequence1 {

  private Z mA = Z.NEG_ONE;
  private final A048138 mSeq = new A048138();
  private int mK = 1;

  @Override
  public Z next() {
    while (true) {
      ++mK;
      final Z result = mSeq.next();
      if (result.compareTo(mA) > 0 && result.isProbablePrime()) {
        mA = result;
        return Z.valueOf(mK);
      }
    }
  }
}
