package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015714.
 * @author Sean A. Irvine
 */
public class A015714 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015714() {
    super(Cyclotomic.inverse(1705));
  }
}
