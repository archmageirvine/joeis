package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015647 Inverse of 1638th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015647 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015647() {
    super(Cyclotomic.inverse(1638));
  }
}
