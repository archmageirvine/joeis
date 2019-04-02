package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015571 Inverse of 1562nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015571 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015571() {
    super(Cyclotomic.inverse(1562));
  }
}
