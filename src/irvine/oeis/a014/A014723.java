package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014723.
 * @author Sean A. Irvine
 */
public class A014723 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014723() {
    super(Cyclotomic.inverse(714));
  }
}
