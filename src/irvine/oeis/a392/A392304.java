package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A392304 Squares whose sum of prime factors (with multiplicity) is also a perfect square.
 * @author Sean A. Irvine
 */
public class A392304 extends Sequence1 {

  private final Sequence mS = new A000290().skip();

  @Override
  public Z next() {
    while (true) {
      final Z s = mS.next();
      if (Functions.SOPFR.z(s).isSquare()) {
        return s;
      }
    }
  }
}
