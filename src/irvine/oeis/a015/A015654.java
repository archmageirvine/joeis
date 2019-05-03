package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015654 Inverse of <code>1645th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015654 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015654() {
    super(Cyclotomic.inverse(1645));
  }
}
