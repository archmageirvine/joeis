package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015852 Inverse of 1843rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015852 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015852() {
    super(Cyclotomic.inverse(1843));
  }
}
