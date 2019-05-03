package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014534 Inverse of <code>525th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014534 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014534() {
    super(Cyclotomic.inverse(525));
  }
}
