package irvine.oeis.a354;
// Generated by gen_seq4.pl 2023-09-10/filtpos at 2023-09-10 21:48

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a346.A346241;

/**
 * A354818 Positions of even terms in A346241.
 * @author Georg Fischer
 */
public class A354818 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A354818() {
    super(1, 1, new A346241(), EVEN);
  }
}
