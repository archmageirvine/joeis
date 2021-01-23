package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014114 Inverse of 105th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014114 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014114() {
    super(Cyclotomic.inverse(105));
  }
}
