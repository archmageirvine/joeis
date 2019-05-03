package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015815 Inverse of <code>1806th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015815 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015815() {
    super(Cyclotomic.inverse(1806));
  }
}
