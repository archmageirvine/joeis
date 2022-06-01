package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014712 Inverse of 703rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014712 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014712() {
    super(Cyclotomic.inverse(703));
  }
}
