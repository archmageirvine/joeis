package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014230 Inverse of 221st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014230 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014230() {
    super(Cyclotomic.inverse(221));
  }
}
