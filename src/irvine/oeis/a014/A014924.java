package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014924.
 * @author Sean A. Irvine
 */
public class A014924 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014924() {
    super(Cyclotomic.inverse(915));
  }
}
