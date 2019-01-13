package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014548.
 * @author Sean A. Irvine
 */
public class A014548 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014548() {
    super(Cyclotomic.inverse(539));
  }
}
