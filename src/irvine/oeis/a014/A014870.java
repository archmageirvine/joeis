package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014870.
 * @author Sean A. Irvine
 */
public class A014870 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014870() {
    super(Cyclotomic.inverse(861));
  }
}
