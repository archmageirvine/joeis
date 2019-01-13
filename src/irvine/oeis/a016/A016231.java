package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016231.
 * @author Sean A. Irvine
 */
public class A016231 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016231() {
    super(Cyclotomic.inverse(2222));
  }
}
