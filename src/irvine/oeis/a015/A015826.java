package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015826.
 * @author Sean A. Irvine
 */
public class A015826 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015826() {
    super(Cyclotomic.inverse(1817));
  }
}
