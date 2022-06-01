package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014240 Inverse of 231st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014240 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014240() {
    super(Cyclotomic.inverse(231));
  }
}
