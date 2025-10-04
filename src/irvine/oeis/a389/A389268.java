package irvine.oeis.a389;

import irvine.oeis.a202.A202343;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389268 allocated for Chris R. Rehmann.
 * @author Sean A. Irvine
 */
public class A389268 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389268() {
    super(1, new A202343().getCR().sqrt());
  }
}

