package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014863 Inverse of 854th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014863 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014863() {
    super(Cyclotomic.inverse(854));
  }
}
