package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014845.
 * @author Sean A. Irvine
 */
public class A014845 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014845() {
    super(Cyclotomic.inverse(836));
  }
}
