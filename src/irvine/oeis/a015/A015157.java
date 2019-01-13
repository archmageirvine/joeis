package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015157.
 * @author Sean A. Irvine
 */
public class A015157 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015157() {
    super(Cyclotomic.inverse(1148));
  }
}
