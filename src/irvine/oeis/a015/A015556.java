package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015556 Inverse of <code>1547th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015556 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015556() {
    super(Cyclotomic.inverse(1547));
  }
}
