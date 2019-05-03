package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015175 Inverse of <code>1166th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015175 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015175() {
    super(Cyclotomic.inverse(1166));
  }
}
