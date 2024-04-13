package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A068989 Squares which when reversed are primes (ignore leading zeros).
 * @author Sean A. Irvine
 */
public class A068989 extends FilterSequence {

  /** Construct the sequence. */
  public A068989() {
    super(1, new A000290(), k -> {
      return Functions.REVERSE.z(k).isProbablePrime();
    });
  }
}
