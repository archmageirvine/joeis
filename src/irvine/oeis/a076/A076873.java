package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.a007.A007504;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076873 Smallest prime not less than sum of first n primes.
 * @author Sean A. Irvine
 */
public class A076873 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076873() {
    super(1, new A007504().skip(), k -> Functions.NEXT_PRIME.z(k.subtract(1)));
  }
}
