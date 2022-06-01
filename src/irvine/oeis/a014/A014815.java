package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014815 Inverse of 806th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014815 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014815() {
    super(Cyclotomic.inverse(806));
  }
}
