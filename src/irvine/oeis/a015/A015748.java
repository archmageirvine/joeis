package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015748 Inverse of 1739th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015748 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015748() {
    super(Cyclotomic.inverse(1739));
  }
}
