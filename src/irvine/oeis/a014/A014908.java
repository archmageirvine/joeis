package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014908 Inverse of 899th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014908 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014908() {
    super(Cyclotomic.inverse(899));
  }
}
