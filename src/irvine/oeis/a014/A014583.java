package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014583 Inverse of 574th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014583 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014583() {
    super(Cyclotomic.inverse(574));
  }
}
