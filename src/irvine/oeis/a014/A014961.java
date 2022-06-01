package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014961 Inverse of 952nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014961 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014961() {
    super(Cyclotomic.inverse(952));
  }
}
