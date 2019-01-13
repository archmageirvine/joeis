package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016143.
 * @author Sean A. Irvine
 */
public class A016143 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016143() {
    super(Cyclotomic.inverse(2134));
  }
}
