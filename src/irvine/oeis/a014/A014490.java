package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014490.
 * @author Sean A. Irvine
 */
public class A014490 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014490() {
    super(Cyclotomic.inverse(481));
  }
}
