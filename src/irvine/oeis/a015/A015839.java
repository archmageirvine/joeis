package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015839 Inverse of <code>1830th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015839 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015839() {
    super(Cyclotomic.inverse(1830));
  }
}
