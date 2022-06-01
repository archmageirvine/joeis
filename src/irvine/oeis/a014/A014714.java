package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014714 Inverse of 705th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014714 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014714() {
    super(Cyclotomic.inverse(705));
  }
}
