package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015254 Inverse of <code>1245th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015254 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015254() {
    super(Cyclotomic.inverse(1245));
  }
}
