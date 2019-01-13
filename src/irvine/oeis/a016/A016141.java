package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016141.
 * @author Sean A. Irvine
 */
public class A016141 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016141() {
    super(Cyclotomic.inverse(2132));
  }
}
