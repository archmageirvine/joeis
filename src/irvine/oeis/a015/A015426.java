package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015426.
 * @author Sean A. Irvine
 */
public class A015426 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015426() {
    super(Cyclotomic.inverse(1417));
  }
}
