package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014763 Inverse of 754th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014763 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014763() {
    super(Cyclotomic.inverse(754));
  }
}
