package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015642.
 * @author Sean A. Irvine
 */
public class A015642 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015642() {
    super(Cyclotomic.inverse(1633));
  }
}
