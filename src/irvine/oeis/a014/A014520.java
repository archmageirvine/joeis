package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014520 Inverse of 511th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014520 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014520() {
    super(Cyclotomic.inverse(511));
  }
}
