package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015857 Inverse of 1848th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015857 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015857() {
    super(Cyclotomic.inverse(1848));
  }
}
