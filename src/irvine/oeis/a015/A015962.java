package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015962 Inverse of 1953rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015962 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015962() {
    super(Cyclotomic.inverse(1953));
  }
}
