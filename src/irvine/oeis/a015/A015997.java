package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015997 Inverse of 1988th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015997 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015997() {
    super(Cyclotomic.inverse(1988));
  }
}
