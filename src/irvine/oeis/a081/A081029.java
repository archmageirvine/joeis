package irvine.oeis.a081;

import irvine.oeis.RecordSequence;
import irvine.oeis.a080.A080997;

/**
 * A081029 Highly central numbers: numbers having a centrality higher than that of any larger number.
 * @author Sean A. Irvine
 */
public class A081029 extends RecordSequence {

  /** Construct the sequence. */
  public A081029() {
    super(1, new A080997());
  }
}

