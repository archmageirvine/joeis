package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016221.
 * @author Sean A. Irvine
 */
public class A016221 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016221() {
    super(Cyclotomic.inverse(2212));
  }
}
