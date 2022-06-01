package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014724 Inverse of 715th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014724 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014724() {
    super(Cyclotomic.inverse(715));
  }
}
