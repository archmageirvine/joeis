package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015115 Inverse of <code>1106th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015115 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015115() {
    super(Cyclotomic.inverse(1106));
  }
}
