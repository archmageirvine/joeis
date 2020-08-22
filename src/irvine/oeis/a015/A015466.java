package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015466 Inverse of 1457th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015466 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015466() {
    super(Cyclotomic.inverse(1457));
  }
}
