package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015076 Inverse of <code>1067th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015076 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015076() {
    super(Cyclotomic.inverse(1067));
  }
}
