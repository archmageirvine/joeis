package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015435 Inverse of <code>1426th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015435 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015435() {
    super(Cyclotomic.inverse(1426));
  }
}
