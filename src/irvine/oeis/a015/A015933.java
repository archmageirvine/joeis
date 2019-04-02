package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015933 Inverse of 1924th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015933 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015933() {
    super(Cyclotomic.inverse(1924));
  }
}
