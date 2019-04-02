package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014373 Inverse of 364th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014373 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014373() {
    super(Cyclotomic.inverse(364));
  }
}
