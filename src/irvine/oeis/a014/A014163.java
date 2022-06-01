package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014163 Inverse of 154th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014163 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014163() {
    super(Cyclotomic.inverse(154));
  }
}
