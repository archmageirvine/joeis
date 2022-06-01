package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014826 Inverse of 817th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014826 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014826() {
    super(Cyclotomic.inverse(817));
  }
}
