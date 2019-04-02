package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015366 Inverse of 1357th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015366 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015366() {
    super(Cyclotomic.inverse(1357));
  }
}
