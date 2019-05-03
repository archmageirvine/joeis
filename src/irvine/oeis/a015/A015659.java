package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015659 Inverse of <code>1650th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015659 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015659() {
    super(Cyclotomic.inverse(1650));
  }
}
