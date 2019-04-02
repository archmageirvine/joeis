package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014519 Inverse of 510th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014519 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014519() {
    super(Cyclotomic.inverse(510));
  }
}
