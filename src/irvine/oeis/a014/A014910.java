package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014910 Inverse of 901st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014910 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014910() {
    super(Cyclotomic.inverse(901));
  }
}
