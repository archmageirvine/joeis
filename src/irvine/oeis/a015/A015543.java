package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015543 Inverse of 1534th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015543 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015543() {
    super(Cyclotomic.inverse(1534));
  }
}
