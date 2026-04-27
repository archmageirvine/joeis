package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A084620 Fibonacci numbers k such that concatenation of k and its 10's complement is a prime.
 * @author Sean A. Irvine
 */
public class A084620 extends Sequence1 {

  private final Sequence mF = new A000045().skip(2);

  @Override
  public Z next() {
    while (true) {
      final Z f = mF.next();
      final Z t = new Z(f + Functions.TENS_COMPLEMENT.z(f).toString());
      if (t.isProbablePrime()) {
        return f;
      }
    }
  }
}

