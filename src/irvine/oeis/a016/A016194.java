package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016194.
 * @author Sean A. Irvine
 */
public class A016194 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016194() {
    super(Cyclotomic.inverse(2185));
  }
}
