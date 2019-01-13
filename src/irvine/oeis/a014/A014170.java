package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014170.
 * @author Sean A. Irvine
 */
public class A014170 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014170() {
    super(Cyclotomic.inverse(161));
  }
}
