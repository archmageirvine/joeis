package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015956 Inverse of <code>1947th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015956 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015956() {
    super(Cyclotomic.inverse(1947));
  }
}
