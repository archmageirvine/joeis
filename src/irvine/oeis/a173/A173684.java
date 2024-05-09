package irvine.oeis.a173;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002062;

/**
 * A173684 Semiprimes of the form Fibonacci(k) + k.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A173684 extends FilterSequence {

  /** Construct the sequence. */
  public A173684() {
    super(1, new A002062(), SEMIPRIME);
  }
}
