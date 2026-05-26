package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084975 Primes p(k+1) that show the slow decrease in the larger values of the Andrica function Af(k) = sqrt(p(k+1)) - sqrt(p(k)), where p(k) denotes the k-th prime.
 * @author Sean A. Irvine
 */
public class A084975 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084975() {
    super(1, new A084974(), Functions.NEXT_PRIME::z);
  }
}
