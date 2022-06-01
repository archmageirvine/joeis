package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014808 Inverse of 799th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014808 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014808() {
    super(Cyclotomic.inverse(799));
  }
}
