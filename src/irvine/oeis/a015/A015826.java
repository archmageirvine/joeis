package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015826 Inverse of 1817th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015826 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015826() {
    super(Cyclotomic.inverse(1817));
  }
}
