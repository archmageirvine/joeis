package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014199 Inverse of 190th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014199 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014199() {
    super(Cyclotomic.inverse(190));
  }
}
