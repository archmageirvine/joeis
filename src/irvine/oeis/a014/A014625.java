package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014625.
 * @author Sean A. Irvine
 */
public class A014625 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014625() {
    super(Cyclotomic.inverse(616));
  }
}
