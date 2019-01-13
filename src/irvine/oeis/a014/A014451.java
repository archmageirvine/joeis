package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014451.
 * @author Sean A. Irvine
 */
public class A014451 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014451() {
    super(Cyclotomic.inverse(442));
  }
}
