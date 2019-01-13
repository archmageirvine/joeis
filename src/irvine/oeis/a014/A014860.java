package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014860.
 * @author Sean A. Irvine
 */
public class A014860 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014860() {
    super(Cyclotomic.inverse(851));
  }
}
