package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014676 Inverse of 667th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014676 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014676() {
    super(Cyclotomic.inverse(667));
  }
}
