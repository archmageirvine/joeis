package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014264 Inverse of 255th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014264 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014264() {
    super(Cyclotomic.inverse(255));
  }
}
