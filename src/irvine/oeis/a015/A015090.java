package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015090 Inverse of 1081st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015090 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015090() {
    super(Cyclotomic.inverse(1081));
  }
}
