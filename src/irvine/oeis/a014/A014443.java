package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014443 Inverse of 434th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014443 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014443() {
    super(Cyclotomic.inverse(434));
  }
}
