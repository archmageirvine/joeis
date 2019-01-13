package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014177.
 * @author Sean A. Irvine
 */
public class A014177 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014177() {
    super(Cyclotomic.inverse(168));
  }
}
