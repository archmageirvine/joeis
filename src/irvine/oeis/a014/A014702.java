package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014702 Inverse of 693rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014702 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014702() {
    super(Cyclotomic.inverse(693));
  }
}
