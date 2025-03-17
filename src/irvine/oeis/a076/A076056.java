package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A076056 Primes which when read backwards are composite numbers.
 * @author Sean A. Irvine
 */
public class A076056 extends FilterSequence {

  /** Construct the sequence. */
  public A076056() {
    super(new A000040(), k -> !Functions.REVERSE.z(k).isProbablePrime());
  }
}
