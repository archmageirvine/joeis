package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014998.
 * @author Sean A. Irvine
 */
public class A014998 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014998() {
    super(Cyclotomic.inverse(989));
  }
}
