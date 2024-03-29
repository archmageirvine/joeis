package irvine.oeis.a306;
// Generated by gen_seq4.pl union/union2 at 2023-08-16 22:08

import irvine.oeis.UnionSequence;
import irvine.oeis.a059.A059047;
import irvine.oeis.a246.A246547;

/**
 * A306531 Composite numbers k such that the sum of their aliquot parts divides k-1.
 * @author Georg Fischer
 */
public class A306531 extends UnionSequence {

  /** Construct the sequence. */
  public A306531() {
    super(1, new A059047(), new A246547());
  }
}
