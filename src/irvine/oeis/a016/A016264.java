package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016264.
 * @author Sean A. Irvine
 */
public class A016264 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016264() {
    super(Cyclotomic.inverse(2255));
  }
}
