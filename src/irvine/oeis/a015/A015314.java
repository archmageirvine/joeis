package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015314.
 * @author Sean A. Irvine
 */
public class A015314 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015314() {
    super(Cyclotomic.inverse(1305));
  }
}
