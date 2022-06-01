package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014604 Inverse of 595th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014604 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014604() {
    super(Cyclotomic.inverse(595));
  }
}
