package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015198 Inverse of <code>1189th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015198 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015198() {
    super(Cyclotomic.inverse(1189));
  }
}
