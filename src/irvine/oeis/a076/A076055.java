package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A076055 Composite numbers which when read backwards are primes.
 * @author Sean A. Irvine
 */
public class A076055 extends FilterSequence {

  /** Construct the sequence. */
  public A076055() {
    super(new A002808(), k -> Functions.REVERSE.z(k).isProbablePrime());
  }
}
