package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014474 Inverse of 465th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014474 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014474() {
    super(Cyclotomic.inverse(465));
  }
}
