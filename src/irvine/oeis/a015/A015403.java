package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015403 Inverse of 1394th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015403 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015403() {
    super(Cyclotomic.inverse(1394));
  }
}
