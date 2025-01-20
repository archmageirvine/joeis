package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074281 Primes of the form Lucas(2*n)/3.
 * @author Sean A. Irvine
 */
public class A074281 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z l = Functions.LUCAS.z(2 * ++mN);
      final Z[] t = l.divideAndRemainder(3);
      if (t[1].isZero() && t[0].isProbablePrime()) {
        return t[0];
      }
    }
  }
}
