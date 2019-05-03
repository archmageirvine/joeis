package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015059 Inverse of <code>1050th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015059 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015059() {
    super(Cyclotomic.inverse(1050));
  }
}
