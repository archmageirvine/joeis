package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015668 Inverse of <code>1659th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015668 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015668() {
    super(Cyclotomic.inverse(1659));
  }
}
