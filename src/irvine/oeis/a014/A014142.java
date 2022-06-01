package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014142 Inverse of 133rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014142 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014142() {
    super(Cyclotomic.inverse(133));
  }
}
