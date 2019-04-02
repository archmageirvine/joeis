package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014135 Inverse of 126th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014135 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014135() {
    super(Cyclotomic.inverse(126));
  }
}
