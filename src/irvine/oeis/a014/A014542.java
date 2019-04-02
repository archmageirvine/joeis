package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014542 Inverse of 533rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014542 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014542() {
    super(Cyclotomic.inverse(533));
  }
}
