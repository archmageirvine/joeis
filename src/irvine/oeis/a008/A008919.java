package irvine.oeis.a008;

import irvine.oeis.UnionSequence;
import irvine.oeis.a001.A001232;

/**
 * A008919.
 * @author Sean A. Irvine
 */
public class A008919 extends UnionSequence {

  /** Construct the sequence. */
  public A008919() {
    super(new A001232(), new A008918());
  }
}

