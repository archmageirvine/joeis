package irvine.oeis.a181;
// Generated by ./gen_seq4.pl /diffseq0 at 2022-06-26 10:36

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a212.A212091;

/**
 * A181787 Number of solutions to n^2 = a^2 + b^2 + c^2 with positive a, b, c.
 * @author Sean A. Irvine
 */
public class A181787 extends DifferenceSequence {

  /** Construct the sequence. */
  public A181787() {
    super(new PrependSequence(new A212091(), 0));
  }
}
