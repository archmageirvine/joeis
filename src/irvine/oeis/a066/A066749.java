package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001405;

/**
 * A066749 List of primes p which are equal to a central binomial coefficient C(n,floor(n/2)) plus 1.
 * @author Sean A. Irvine
 */
public class A066749 extends Sequence1 {

  private final Sequence mA = new A001405().skip();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next().add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

