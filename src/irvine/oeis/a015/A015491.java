package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015491.
 * @author Sean A. Irvine
 */
public class A015491 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015491() {
    super(Cyclotomic.inverse(1482));
  }
}
