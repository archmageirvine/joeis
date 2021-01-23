package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014339 Inverse of 330th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014339 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014339() {
    super(Cyclotomic.inverse(330));
  }
}
