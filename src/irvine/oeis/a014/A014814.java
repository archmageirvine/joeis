package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014814 Inverse of 805th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014814 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014814() {
    super(Cyclotomic.inverse(805));
  }
}
