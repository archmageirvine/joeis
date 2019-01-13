package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016310.
 * @author Sean A. Irvine
 */
public class A016310 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016310() {
    super(Cyclotomic.inverse(2301));
  }
}
