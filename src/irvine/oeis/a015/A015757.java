package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015757 Inverse of 1748th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015757 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015757() {
    super(Cyclotomic.inverse(1748));
  }
}
