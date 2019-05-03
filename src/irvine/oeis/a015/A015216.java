package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015216 Inverse of <code>1207th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015216 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015216() {
    super(Cyclotomic.inverse(1207));
  }
}
