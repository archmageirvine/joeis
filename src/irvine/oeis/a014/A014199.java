package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014199 Inverse of <code>190th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014199 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014199() {
    super(Cyclotomic.inverse(190));
  }
}
