package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014338 Inverse of <code>329th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014338 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014338() {
    super(Cyclotomic.inverse(329));
  }
}
