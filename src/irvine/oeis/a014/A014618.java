package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014618 Inverse of 609th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014618 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014618() {
    super(Cyclotomic.inverse(609));
  }
}
