package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015087 Inverse of <code>1078th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015087 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015087() {
    super(Cyclotomic.inverse(1078));
  }
}
