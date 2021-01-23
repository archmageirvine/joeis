package irvine.oeis.a083;

import irvine.oeis.SemiprimeSequence;
import irvine.oeis.a020.A020549;

/**
 * A083340 Numbers n such that A020549(n)=(n!)^2+1 is a semiprime.
 * @author Sean A. Irvine
 */
public class A083340 extends SemiprimeSequence {

  /** Construct the sequence. */
  public A083340() {
    super(new A020549(), 0);
  }
}
