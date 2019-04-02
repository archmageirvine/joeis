package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014262 Inverse of 253rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014262 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014262() {
    super(Cyclotomic.inverse(253));
  }
}
