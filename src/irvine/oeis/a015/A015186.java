package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015186.
 * @author Sean A. Irvine
 */
public class A015186 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015186() {
    super(Cyclotomic.inverse(1177));
  }
}
