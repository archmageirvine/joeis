package irvine.oeis.a050;

import irvine.oeis.a014.A014254;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A050280 Prime liponombres.
 * @author Sean A. Irvine
 */
public class A050280 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050280() {
    super(new A014254());
  }
}
