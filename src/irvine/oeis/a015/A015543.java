package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015543 Inverse of <code>1534th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015543 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015543() {
    super(Cyclotomic.inverse(1534));
  }
}
