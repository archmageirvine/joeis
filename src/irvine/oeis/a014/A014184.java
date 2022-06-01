package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014184 Inverse of 175th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014184 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014184() {
    super(Cyclotomic.inverse(175));
  }
}
