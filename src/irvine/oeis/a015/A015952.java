package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015952.
 * @author Sean A. Irvine
 */
public class A015952 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015952() {
    super(Cyclotomic.inverse(1943));
  }
}
