package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015987.
 * @author Sean A. Irvine
 */
public class A015987 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015987() {
    super(Cyclotomic.inverse(1978));
  }
}
