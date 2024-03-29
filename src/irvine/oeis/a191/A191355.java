package irvine.oeis.a191;
// Generated by gen_seq4.pl filterm/filtpos at 2023-09-11 18:58

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a069.A069748;

/**
 * A191355 Indices of terms in A069748 with two decimal digits 1 and all others 0.
 * @author Georg Fischer
 */
public class A191355 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A191355() {
    super(1, 1, new A069748(), v -> v.toString().matches("10*10*"));
  }
}
