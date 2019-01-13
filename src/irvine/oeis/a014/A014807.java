package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014807.
 * @author Sean A. Irvine
 */
public class A014807 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014807() {
    super(Cyclotomic.inverse(798));
  }
}
