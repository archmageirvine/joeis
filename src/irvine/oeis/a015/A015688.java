package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015688 Inverse of <code>1679th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015688 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015688() {
    super(Cyclotomic.inverse(1679));
  }
}
