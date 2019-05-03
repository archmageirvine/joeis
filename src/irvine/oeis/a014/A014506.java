package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014506 Inverse of <code>497th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014506 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014506() {
    super(Cyclotomic.inverse(497));
  }
}
