package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015012 Inverse of 1003rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015012 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015012() {
    super(Cyclotomic.inverse(1003));
  }
}
