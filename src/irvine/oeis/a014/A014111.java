package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014111 Inverse of 102nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014111 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014111() {
    super(Cyclotomic.inverse(102));
  }
}
