package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015171 Inverse of 1162nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015171 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015171() {
    super(Cyclotomic.inverse(1162));
  }
}
