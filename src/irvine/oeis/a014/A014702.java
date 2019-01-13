package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014702.
 * @author Sean A. Irvine
 */
public class A014702 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014702() {
    super(Cyclotomic.inverse(693));
  }
}
