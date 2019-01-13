package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014961.
 * @author Sean A. Irvine
 */
public class A014961 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014961() {
    super(Cyclotomic.inverse(952));
  }
}
