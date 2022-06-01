package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014149 Inverse of 140th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014149 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014149() {
    super(Cyclotomic.inverse(140));
  }
}
