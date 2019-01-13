package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014354.
 * @author Sean A. Irvine
 */
public class A014354 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014354() {
    super(Cyclotomic.inverse(345));
  }
}
