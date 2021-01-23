package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015546 Inverse of 1537th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015546 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015546() {
    super(Cyclotomic.inverse(1537));
  }
}
