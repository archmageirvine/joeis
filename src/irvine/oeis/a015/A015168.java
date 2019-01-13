package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015168.
 * @author Sean A. Irvine
 */
public class A015168 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015168() {
    super(Cyclotomic.inverse(1159));
  }
}
