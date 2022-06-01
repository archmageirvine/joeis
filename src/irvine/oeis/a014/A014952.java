package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014952 Inverse of 943rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014952 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014952() {
    super(Cyclotomic.inverse(943));
  }
}
