package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015248 Inverse of <code>1239th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015248 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015248() {
    super(Cyclotomic.inverse(1239));
  }
}
