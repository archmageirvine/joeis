package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014492 Inverse of 483rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014492 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014492() {
    super(Cyclotomic.inverse(483));
  }
}
