package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015104 Inverse of <code>1095th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015104 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015104() {
    super(Cyclotomic.inverse(1095));
  }
}
