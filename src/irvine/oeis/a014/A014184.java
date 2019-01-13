package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014184.
 * @author Sean A. Irvine
 */
public class A014184 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014184() {
    super(Cyclotomic.inverse(175));
  }
}
