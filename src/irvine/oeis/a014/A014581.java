package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014581.
 * @author Sean A. Irvine
 */
public class A014581 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014581() {
    super(Cyclotomic.inverse(572));
  }
}
