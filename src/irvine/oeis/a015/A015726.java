package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015726 Inverse of 1717th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015726 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015726() {
    super(Cyclotomic.inverse(1717));
  }
}
