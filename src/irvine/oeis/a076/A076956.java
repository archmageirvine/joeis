package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076956 Smallest k^2 such that there are exactly n primes between k^2 and (k+1)^2.
 * @author Sean A. Irvine
 */
public class A076956 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076956() {
    super(2, new A076957(), Z::square);
  }
}

