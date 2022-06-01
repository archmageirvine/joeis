package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014722 Inverse of 713th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014722 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014722() {
    super(Cyclotomic.inverse(713));
  }
}
