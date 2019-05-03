package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015373 Inverse of <code>1364th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015373 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015373() {
    super(Cyclotomic.inverse(1364));
  }
}
