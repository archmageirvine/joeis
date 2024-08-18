package irvine.oeis.a032;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000959;

/**
 * A032601 a(n) = n-th prime number x n-th lucky number.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A032601 extends Combiner {

  /** Construct the sequence. */
  public A032601() {
    super(1, new A000040(), new A000959(), MULTIPLY);
  }
}
