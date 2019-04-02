package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014590 Inverse of 581st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014590 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014590() {
    super(Cyclotomic.inverse(581));
  }
}
