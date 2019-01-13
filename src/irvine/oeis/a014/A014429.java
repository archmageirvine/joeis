package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014429.
 * @author Sean A. Irvine
 */
public class A014429 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014429() {
    super(Cyclotomic.inverse(420));
  }
}
