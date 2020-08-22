package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014786 Inverse of 777th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014786 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014786() {
    super(Cyclotomic.inverse(777));
  }
}
