package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015985 Inverse of <code>1976th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015985 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015985() {
    super(Cyclotomic.inverse(1976));
  }
}
