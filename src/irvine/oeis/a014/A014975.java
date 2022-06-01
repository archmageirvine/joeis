package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014975 Inverse of 966th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014975 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014975() {
    super(Cyclotomic.inverse(966));
  }
}
