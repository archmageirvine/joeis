package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015918 Inverse of 1909th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015918 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015918() {
    super(Cyclotomic.inverse(1909));
  }
}
