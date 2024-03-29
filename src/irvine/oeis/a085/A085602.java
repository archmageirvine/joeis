package irvine.oeis.a085;
// Generated by gen_seq4.pl 2024-03-26/filter at 2024-03-26 23:22

import irvine.oeis.FilterSequence;
import irvine.oeis.a014.A014566;

/**
 * A085602 Numbers of the form (2n+1)^(2n+1) + 1.
 * @author Georg Fischer
 */
public class A085602 extends FilterSequence {

  /** Construct the sequence. */
  public A085602() {
    super(1, new A014566(), (k, v) -> (k & 1) == 1);
  }
}
