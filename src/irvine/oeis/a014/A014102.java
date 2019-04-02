package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014102 Inverse of 93rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014102 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014102() {
    super(Cyclotomic.inverse(93));
  }
}
