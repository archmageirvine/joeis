package irvine.oeis.a080;

import irvine.oeis.Combiner;
import irvine.oeis.a215.A215406;

/**
 * A080300 Global ranking function for totally balanced binary sequences.
 * @author Sean A. Irvine
 */
public class A080300 extends Combiner {

  /** Construct the sequence. */
  public A080300() {
    super(0, new A080116(), new A215406(), MULTIPLY);
  }
}

