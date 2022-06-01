package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014104 Inverse of 95th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014104 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014104() {
    super(Cyclotomic.inverse(95));
  }
}
