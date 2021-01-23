package irvine.oeis.a038;

import irvine.oeis.PositionOfNSequence;

/**
 * A038204 Least k such that factorials have exactly n distinct residues mod k.
 * @author Sean A. Irvine
 */
public class A038204 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A038204() {
    super(new A038203(), 1);
  }
}
