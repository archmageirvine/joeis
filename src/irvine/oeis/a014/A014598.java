package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014598.
 * @author Sean A. Irvine
 */
public class A014598 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014598() {
    super(Cyclotomic.inverse(589));
  }
}
