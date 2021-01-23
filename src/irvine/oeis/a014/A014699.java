package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014699 Inverse of 690th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014699 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014699() {
    super(Cyclotomic.inverse(690));
  }
}
