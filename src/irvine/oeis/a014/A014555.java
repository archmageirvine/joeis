package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014555 Inverse of 546th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014555 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014555() {
    super(Cyclotomic.inverse(546));
  }
}
