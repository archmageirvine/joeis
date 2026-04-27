package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A084621 Numbers k such that Fibonacci(k) concatenated with its 10's complement is prime.
 * @author Sean A. Irvine
 */
public class A084621 extends Sequence1 {

  private final Sequence mF = new A000045();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z f = mF.next();
      final Z t = new Z(f + Functions.TENS_COMPLEMENT.z(f).toString());
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

