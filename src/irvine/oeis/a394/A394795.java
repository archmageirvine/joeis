package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A394795 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A394795 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A394795() {
    super(1, k -> {
      for (final Z dd : Jaguar.factor(k).divisors()) {
        final long d = dd.longValue();
        final Z x = Z.THREE.pow(k / d).shiftLeft(d);
        if (x.subtract(1).isProbablePrime() && x.add(1).isProbablePrime()) {
          return true;
        }
      }
      return false;
    });
  }
}

