package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015563 Inverse of <code>1554th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015563 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015563() {
    super(Cyclotomic.inverse(1554));
  }
}
