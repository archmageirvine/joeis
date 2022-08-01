package irvine.oeis.a339;

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A339935 Primes p such that p+(p^2-1)/6 is a square.
 * @author Georg Fischer
 */
public class A339935 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A339935() {
    super(0, "[[-24],[1],[0],[-10],[0],[1]]", "1, 1, 5, 29", 0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (result.isProbablePrime()) {
        return result;
      }
    }
  }
}
