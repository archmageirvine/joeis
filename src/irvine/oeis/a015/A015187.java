package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015187 Inverse of <code>1178th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015187 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015187() {
    super(Cyclotomic.inverse(1178));
  }
}
