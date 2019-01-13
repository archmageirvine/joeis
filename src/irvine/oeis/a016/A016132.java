package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016132.
 * @author Sean A. Irvine
 */
public class A016132 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016132() {
    super(Cyclotomic.inverse(2123));
  }
}
