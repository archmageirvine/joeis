package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015868 Inverse of <code>1859th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015868 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015868() {
    super(Cyclotomic.inverse(1859));
  }
}
