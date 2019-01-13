package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016182.
 * @author Sean A. Irvine
 */
public class A016182 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016182() {
    super(Cyclotomic.inverse(2173));
  }
}
