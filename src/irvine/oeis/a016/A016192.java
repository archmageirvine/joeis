package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016192.
 * @author Sean A. Irvine
 */
public class A016192 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016192() {
    super(Cyclotomic.inverse(2183));
  }
}
