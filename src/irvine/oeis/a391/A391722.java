package irvine.oeis.a391;

import irvine.oeis.FilterSequence;
import irvine.oeis.a050.A050249;
import irvine.oeis.a125.A125001;

/**
 * A391722 Weakly primes (A050249) that are also non-insertable primes (A125001).
 * @author Sean A. Irvine
 */
public class A391722 extends FilterSequence {

  /** Construct the sequence. */
  public A391722() {
    super(1, new A050249(), A125001::isNoninsertablePrime);
  }
}
