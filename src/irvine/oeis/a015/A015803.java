package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015803 Inverse of 1794th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015803 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015803() {
    super(Cyclotomic.inverse(1794));
  }
}
