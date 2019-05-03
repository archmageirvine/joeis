package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015703 Inverse of <code>1694th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015703 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015703() {
    super(Cyclotomic.inverse(1694));
  }
}
