package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014835 Inverse of 826th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014835 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014835() {
    super(Cyclotomic.inverse(826));
  }
}
