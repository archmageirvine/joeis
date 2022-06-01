package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015956 Inverse of 1947th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015956 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015956() {
    super(Cyclotomic.inverse(1947));
  }
}
