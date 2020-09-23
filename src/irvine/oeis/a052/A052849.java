package irvine.oeis.a052;
// Generated by gen_seq4.pl diffspp at 2020-09-22 15:10
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a066.A066237;

/**
 * A052849 a(0) = 0; a(n+1) = 2*n! (n >= 0).
 * @author Georg Fischer
 */
public class A052849 extends PrependSequence {

  /** Construct the sequence. */
  public A052849() {
    super(new DifferenceSequence(new A066237()), 0);
  }
}
