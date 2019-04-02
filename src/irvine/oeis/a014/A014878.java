package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014878 Inverse of 869th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014878 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014878() {
    super(Cyclotomic.inverse(869));
  }
}
