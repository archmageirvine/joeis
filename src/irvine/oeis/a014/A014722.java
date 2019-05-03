package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014722 Inverse of <code>713th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014722 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014722() {
    super(Cyclotomic.inverse(713));
  }
}
