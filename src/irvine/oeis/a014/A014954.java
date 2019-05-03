package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014954 Inverse of <code>945th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014954 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014954() {
    super(Cyclotomic.inverse(945));
  }
}
