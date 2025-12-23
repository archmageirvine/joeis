package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A389431 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A389431 extends PrependSequence {

  /** Construct the sequence. */
  public A389431() {
    super(new TwoParameterFormSequence(1, 2, 1, (k, j) -> Functions.PRIME.z(k).pow(Functions.PRIME.l(j)).subtract(2)) {
      @Override
      protected boolean accept(final long x, final long y, final Z n, final Z prev) {
        return n.isProbablePrime();
      }
    }, 2);
  }
}

