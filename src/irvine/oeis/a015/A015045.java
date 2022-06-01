package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015045 Inverse of 1036th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015045 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015045() {
    super(Cyclotomic.inverse(1036));
  }
}
