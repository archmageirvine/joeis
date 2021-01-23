package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015668 Inverse of 1659th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015668 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015668() {
    super(Cyclotomic.inverse(1659));
  }
}
