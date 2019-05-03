package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014658 Inverse of <code>649th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014658 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014658() {
    super(Cyclotomic.inverse(649));
  }
}
