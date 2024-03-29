package irvine.oeis.a327;
// Generated by ./gen_seq4.pl /diffseq0 at 2022-06-26 10:36

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A327491 a(0) = 0. If 4 divides n then a(n) = valuation(n, 2) else a(n) = (n mod 2) + 1.
 * @author Sean A. Irvine
 */
public class A327491 extends DifferenceSequence {

  /** Construct the sequence. */
  public A327491() {
    super(new PrependSequence(new A327492(), 0));
  }
}
