package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014893.
 * @author Sean A. Irvine
 */
public class A014893 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014893() {
    super(Cyclotomic.inverse(884));
  }
}
