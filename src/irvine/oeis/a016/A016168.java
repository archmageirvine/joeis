package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016168 Inverse of 2159th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016168 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016168() {
    super(Cyclotomic.inverse(2159));
  }
}
