package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016284.
 * @author Sean A. Irvine
 */
public class A016284 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016284() {
    super(Cyclotomic.inverse(2275));
  }
}
