package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015839 Inverse of 1830th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015839 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015839() {
    super(Cyclotomic.inverse(1830));
  }
}
