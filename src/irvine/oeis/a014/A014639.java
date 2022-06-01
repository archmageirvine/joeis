package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014639 Inverse of 630th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014639 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014639() {
    super(Cyclotomic.inverse(630));
  }
}
