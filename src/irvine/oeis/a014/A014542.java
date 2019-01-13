package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014542.
 * @author Sean A. Irvine
 */
public class A014542 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014542() {
    super(Cyclotomic.inverse(533));
  }
}
