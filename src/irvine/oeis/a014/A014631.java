package irvine.oeis.a014;

import irvine.oeis.DistinctSequence;
import irvine.oeis.a007.A007318;

/**
 * A014631 Numbers in order in which they appear in Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A014631 extends DistinctSequence {

  /** Construct the sequence. */
  public A014631() {
    super(new A007318());
  }
}
