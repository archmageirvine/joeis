package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015032 Inverse of 1023rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015032 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015032() {
    super(Cyclotomic.inverse(1023));
  }
}
