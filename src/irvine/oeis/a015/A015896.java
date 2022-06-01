package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015896 Inverse of 1887th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015896 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015896() {
    super(Cyclotomic.inverse(1887));
  }
}
