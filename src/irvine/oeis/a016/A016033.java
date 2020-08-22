package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016033 Inverse of 2024th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016033 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016033() {
    super(Cyclotomic.inverse(2024));
  }
}
