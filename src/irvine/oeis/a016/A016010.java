package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016010.
 * @author Sean A. Irvine
 */
public class A016010 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016010() {
    super(Cyclotomic.inverse(2001));
  }
}
