package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016287.
 * @author Sean A. Irvine
 */
public class A016287 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016287() {
    super(Cyclotomic.inverse(2278));
  }
}
