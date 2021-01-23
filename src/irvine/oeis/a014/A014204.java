package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014204 Inverse of 195th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014204 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014204() {
    super(Cyclotomic.inverse(195));
  }
}
