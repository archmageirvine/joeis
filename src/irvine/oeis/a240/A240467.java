package irvine.oeis.a240;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A240467.
 * @author Sean A. Irvine
 */
public class A240467 extends PeriodicSequence {

  /** Construct the sequence. */
  public A240467() {
    super(Cyclotomic.inverse(152));
  }
}
