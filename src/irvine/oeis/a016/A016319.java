package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016319.
 * @author Sean A. Irvine
 */
public class A016319 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016319() {
    super(Cyclotomic.inverse(2310));
  }
}
