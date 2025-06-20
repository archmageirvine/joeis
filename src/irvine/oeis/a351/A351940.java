package irvine.oeis.a351;
// Generated by gen_seq4.pl 2025-06-15.ack/polyxa at 2025-06-15 21:33

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a010.A010051;

/**
 * A351940 a(n) is the number of partitions of the set {1,2,...,n} into lists having a prime number of elements.
 * new A010051()
 * @author Georg Fischer
 */
public class A351940 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A351940() {
    super(0, "[1]", "x,B,exp", 0, 1, 1, 1, new A010051());
  }
}
