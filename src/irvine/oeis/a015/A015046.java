package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015046 Inverse of <code>1037th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015046 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015046() {
    super(Cyclotomic.inverse(1037));
  }
}
