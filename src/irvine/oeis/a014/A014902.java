package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014902 Inverse of 893rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014902 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014902() {
    super(Cyclotomic.inverse(893));
  }
}
