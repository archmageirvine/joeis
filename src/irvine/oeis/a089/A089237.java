package irvine.oeis.a089;

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000290;

/**
 * A089237 List of primes and squares.
 * @author Sean A. Irvine
 */
public class A089237 extends UnionSequence {

  /** Construct the sequence. */
  public A089237() {
    super(new A000040(), new A000290());
  }
}
