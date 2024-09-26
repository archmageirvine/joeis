package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A072367 Squares x such that x + reverse of x is a prime.
 * @author Sean A. Irvine
 */
public class A072367 extends Sequence1 {

  private final Sequence mSquares = new A000290().skip();

  @Override
  public Z next() {
    while (true) {
      final Z s = mSquares.next();
      if (s.add(Functions.REVERSE.z(s)).isProbablePrime()) {
        return s;
      }
    }
  }
}
