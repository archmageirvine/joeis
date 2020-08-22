package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015717 Inverse of 1708th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015717 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015717() {
    super(Cyclotomic.inverse(1708));
  }
}
