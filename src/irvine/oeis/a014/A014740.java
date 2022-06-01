package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014740 Inverse of 731st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014740 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014740() {
    super(Cyclotomic.inverse(731));
  }
}
