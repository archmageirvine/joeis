package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016042.
 * @author Sean A. Irvine
 */
public class A016042 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016042() {
    super(Cyclotomic.inverse(2033));
  }
}
