package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014562 Inverse of 553rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014562 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014562() {
    super(Cyclotomic.inverse(553));
  }
}
