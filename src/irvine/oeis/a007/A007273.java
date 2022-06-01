package irvine.oeis.a007;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A007273 Inverse of 1155th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A007273 extends PeriodicSequence {

  /** Construct the sequence. */
  public A007273() {
    super(Cyclotomic.inverse(1155));
  }
}
