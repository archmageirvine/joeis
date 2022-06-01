package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014658 Inverse of 649th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014658 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014658() {
    super(Cyclotomic.inverse(649));
  }
}
