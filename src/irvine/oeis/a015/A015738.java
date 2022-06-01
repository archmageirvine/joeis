package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015738 Inverse of 1729th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015738 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015738() {
    super(Cyclotomic.inverse(1729));
  }
}
