package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014128.
 * @author Sean A. Irvine
 */
public class A014128 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014128() {
    super(Cyclotomic.inverse(119));
  }
}
