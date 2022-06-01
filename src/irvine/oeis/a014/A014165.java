package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014165 Inverse of 156th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014165 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014165() {
    super(Cyclotomic.inverse(156));
  }
}
