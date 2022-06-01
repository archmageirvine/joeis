package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015778 Inverse of 1769th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015778 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015778() {
    super(Cyclotomic.inverse(1769));
  }
}
