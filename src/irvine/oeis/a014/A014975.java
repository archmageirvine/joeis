package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014975.
 * @author Sean A. Irvine
 */
public class A014975 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014975() {
    super(Cyclotomic.inverse(966));
  }
}
