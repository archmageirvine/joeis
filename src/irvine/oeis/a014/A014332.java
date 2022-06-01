package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014332 Inverse of 323rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014332 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014332() {
    super(Cyclotomic.inverse(323));
  }
}
