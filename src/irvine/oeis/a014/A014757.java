package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014757.
 * @author Sean A. Irvine
 */
public class A014757 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014757() {
    super(Cyclotomic.inverse(748));
  }
}
