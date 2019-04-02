package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014294 Inverse of 285th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014294 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014294() {
    super(Cyclotomic.inverse(285));
  }
}
