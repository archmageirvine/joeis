package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015318 Inverse of <code>1309th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015318 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015318() {
    super(Cyclotomic.inverse(1309));
  }
}
