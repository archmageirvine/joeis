package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015483 Inverse of <code>1474th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015483 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015483() {
    super(Cyclotomic.inverse(1474));
  }
}
