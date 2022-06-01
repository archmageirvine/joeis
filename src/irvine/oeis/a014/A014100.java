package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014100 Inverse of 91st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014100 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014100() {
    super(Cyclotomic.inverse(91));
  }
}
