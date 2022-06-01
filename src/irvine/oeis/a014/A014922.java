package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014922 Inverse of 913th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014922 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014922() {
    super(Cyclotomic.inverse(913));
  }
}
