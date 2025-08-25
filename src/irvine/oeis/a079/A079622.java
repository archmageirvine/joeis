package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000668;

/**
 * A079622 Mersenne primes with prime "look and say" descriptions.
 * @author Sean A. Irvine
 */
public class A079622 extends FilterSequence {

  /** Construct the sequence. */
  public A079622() {
    super(1, new A000668(), k -> Functions.LOOK_AND_SAY.z(k).isProbablePrime());
  }
}

