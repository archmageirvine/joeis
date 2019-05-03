package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015738 Inverse of <code>1729th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015738 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015738() {
    super(Cyclotomic.inverse(1729));
  }
}
