package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015703 Inverse of 1694th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015703 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015703() {
    super(Cyclotomic.inverse(1694));
  }
}
