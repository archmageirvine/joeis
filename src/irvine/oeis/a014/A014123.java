package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014123 Inverse of 114th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014123 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014123() {
    super(Cyclotomic.inverse(114));
  }
}
