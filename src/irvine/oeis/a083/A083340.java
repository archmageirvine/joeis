package irvine.oeis.a083;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a020.A020549;

/**
 * A083340 Numbers n such that A020549(n)=(n!)^2+1 is a semiprime.
 * @author Sean A. Irvine
 */
public class A083340 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A083340() {
    super(1, 0, new A020549(), SEMIPRIME);
  }
}
