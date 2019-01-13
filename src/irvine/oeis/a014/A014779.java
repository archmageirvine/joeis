package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014779.
 * @author Sean A. Irvine
 */
public class A014779 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014779() {
    super(Cyclotomic.inverse(770));
  }
}
