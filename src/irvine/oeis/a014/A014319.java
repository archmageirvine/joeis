package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014319.
 * @author Sean A. Irvine
 */
public class A014319 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014319() {
    super(Cyclotomic.inverse(310));
  }
}
