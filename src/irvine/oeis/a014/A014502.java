package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014502.
 * @author Sean A. Irvine
 */
public class A014502 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014502() {
    super(Cyclotomic.inverse(493));
  }
}
