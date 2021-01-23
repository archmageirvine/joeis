package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014624 Inverse of 615th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014624 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014624() {
    super(Cyclotomic.inverse(615));
  }
}
