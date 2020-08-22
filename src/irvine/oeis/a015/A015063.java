package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015063 Inverse of 1054th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015063 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015063() {
    super(Cyclotomic.inverse(1054));
  }
}
