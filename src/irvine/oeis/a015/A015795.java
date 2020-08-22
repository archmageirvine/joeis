package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015795 Inverse of 1786th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015795 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015795() {
    super(Cyclotomic.inverse(1786));
  }
}
