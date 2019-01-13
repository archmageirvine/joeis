package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016232.
 * @author Sean A. Irvine
 */
public class A016232 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016232() {
    super(Cyclotomic.inverse(2223));
  }
}
