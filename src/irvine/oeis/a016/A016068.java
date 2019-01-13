package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016068.
 * @author Sean A. Irvine
 */
public class A016068 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016068() {
    super(Cyclotomic.inverse(2059));
  }
}
