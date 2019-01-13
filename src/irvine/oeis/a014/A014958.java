package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014958.
 * @author Sean A. Irvine
 */
public class A014958 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014958() {
    super(Cyclotomic.inverse(949));
  }
}
