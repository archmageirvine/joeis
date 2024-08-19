package irvine.oeis.a071;

import irvine.oeis.Combiner;

/**
 * A071825 (Number of x with largest prime factor of the form 4k+3 less than or equal to n) minus (Number of x with largest prime factor of the form 4k+1 less than or equal to n).
 * @author Sean A. Irvine
 */
public class A071825 extends Combiner {

  /** Construct the sequence. */
  public A071825() {
    super(1, new A071823(), new A071824(), SUBTRACT);
  }
}
