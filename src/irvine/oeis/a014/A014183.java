package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014183 Inverse of 174th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014183 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014183() {
    super(Cyclotomic.inverse(174));
  }
}
