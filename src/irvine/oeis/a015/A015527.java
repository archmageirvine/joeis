package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015527 Inverse of 1518th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015527 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015527() {
    super(Cyclotomic.inverse(1518));
  }
}
