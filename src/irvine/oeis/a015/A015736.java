package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015736 Inverse of 1727th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015736 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015736() {
    super(Cyclotomic.inverse(1727));
  }
}
