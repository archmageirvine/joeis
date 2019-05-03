package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015736 Inverse of <code>1727th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015736 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015736() {
    super(Cyclotomic.inverse(1727));
  }
}
