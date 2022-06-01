package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014108 Inverse of 99th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014108 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014108() {
    super(Cyclotomic.inverse(99));
  }
}
