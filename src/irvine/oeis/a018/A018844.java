package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;
import irvine.oeis.UnionSequence;

/**
 * A018844 Arises from generalized Lucas-Lehmer test for primality.
 * @author Sean A. Irvine
 */
public class A018844 extends UnionSequence {

  /** Construct the sequence. */
  public A018844() {
    super(new LinearRecurrence(new long[] {-1, 14}, new long[] {4, 52}),
      new LinearRecurrence(new long[] {-1, 98}, new long[] {10, 970}));
  }
}
