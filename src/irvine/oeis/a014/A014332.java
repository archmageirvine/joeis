package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014332.
 * @author Sean A. Irvine
 */
public class A014332 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014332() {
    super(Cyclotomic.inverse(323));
  }
}
