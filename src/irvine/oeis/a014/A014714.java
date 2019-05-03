package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014714 Inverse of <code>705th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014714 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014714() {
    super(Cyclotomic.inverse(705));
  }
}
