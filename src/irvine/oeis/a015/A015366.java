package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015366 Inverse of <code>1357th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015366 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015366() {
    super(Cyclotomic.inverse(1357));
  }
}
