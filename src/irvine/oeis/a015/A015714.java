package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015714 Inverse of 1705th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015714 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015714() {
    super(Cyclotomic.inverse(1705));
  }
}
