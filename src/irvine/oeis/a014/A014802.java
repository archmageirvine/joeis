package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014802 Inverse of 793rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014802 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014802() {
    super(Cyclotomic.inverse(793));
  }
}
