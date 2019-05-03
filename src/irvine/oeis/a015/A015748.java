package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015748 Inverse of <code>1739th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015748 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015748() {
    super(Cyclotomic.inverse(1739));
  }
}
