package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014971 Inverse of 962nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014971 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014971() {
    super(Cyclotomic.inverse(962));
  }
}
