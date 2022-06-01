package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014746 Inverse of 737th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014746 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014746() {
    super(Cyclotomic.inverse(737));
  }
}
