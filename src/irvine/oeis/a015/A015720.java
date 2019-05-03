package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015720 Inverse of <code>1711th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015720 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015720() {
    super(Cyclotomic.inverse(1711));
  }
}
