package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014408.
 * @author Sean A. Irvine
 */
public class A014408 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014408() {
    super(Cyclotomic.inverse(399));
  }
}
