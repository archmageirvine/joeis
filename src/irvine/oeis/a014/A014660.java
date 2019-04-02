package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014660 Inverse of 651st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014660 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014660() {
    super(Cyclotomic.inverse(651));
  }
}
