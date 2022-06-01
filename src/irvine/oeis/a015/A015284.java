package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015284 Inverse of 1275th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015284 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015284() {
    super(Cyclotomic.inverse(1275));
  }
}
