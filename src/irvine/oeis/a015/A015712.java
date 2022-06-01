package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015712 Inverse of 1703rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015712 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015712() {
    super(Cyclotomic.inverse(1703));
  }
}
