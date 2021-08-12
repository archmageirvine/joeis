package irvine.oeis.a050;

import irvine.oeis.PrimeSubsequence;
import irvine.oeis.a014.A014254;

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
