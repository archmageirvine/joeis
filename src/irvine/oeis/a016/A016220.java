package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016220.
 * @author Sean A. Irvine
 */
public class A016220 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016220() {
    super(Cyclotomic.inverse(2211));
  }
}
