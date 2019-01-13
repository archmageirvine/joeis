package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015256.
 * @author Sean A. Irvine
 */
public class A015256 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015256() {
    super(Cyclotomic.inverse(1247));
  }
}
