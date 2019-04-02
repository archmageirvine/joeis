package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015230 Inverse of 1221st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015230 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015230() {
    super(Cyclotomic.inverse(1221));
  }
}
