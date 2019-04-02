package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014751 Inverse of 742nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014751 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014751() {
    super(Cyclotomic.inverse(742));
  }
}
