package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014380.
 * @author Sean A. Irvine
 */
public class A014380 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014380() {
    super(Cyclotomic.inverse(371));
  }
}
