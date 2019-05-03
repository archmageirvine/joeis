package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015689 Inverse of <code>1680th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015689 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015689() {
    super(Cyclotomic.inverse(1680));
  }
}
