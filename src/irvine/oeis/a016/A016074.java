package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016074.
 * @author Sean A. Irvine
 */
public class A016074 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016074() {
    super(Cyclotomic.inverse(2065));
  }
}
