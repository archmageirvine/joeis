package irvine.oeis.a082;

import irvine.oeis.FiniteSequence;

/**
 * A082593 Values in Pfennigs of German money before the introduction of the Euro.
 * @author Sean A. Irvine
 */
public class A082593 extends FiniteSequence {

  /** Construct the sequence. */
  public A082593() {
    super(1, FINITE, 1, 2, 5, 10, 50, 100, 200, 500, 1000, 2000, 5000, 10000, 20000, 50000, 100000);
  }
}
