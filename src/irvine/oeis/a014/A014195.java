package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014195 Inverse of 186th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014195 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014195() {
    super(Cyclotomic.inverse(186));
  }
}
