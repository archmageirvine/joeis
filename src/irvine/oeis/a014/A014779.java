package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014779 Inverse of 770th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014779 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014779() {
    super(Cyclotomic.inverse(770));
  }
}
