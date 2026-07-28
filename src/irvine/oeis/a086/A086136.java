package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A086136 Primes p such that p and p+12 are nonconsecutive primes.
 * @author Sean A. Irvine
 */
public class A086136 extends FilterSequence {

  /** Construct the sequence. */
  public A086136() {
    super(1, new A000040(), p -> p.add(12).isProbablePrime() && !Functions.NEXT_PRIME.z(p).equals(p.add(12)));
  }
}

