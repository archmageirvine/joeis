package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203464 Numbers n such that 65 divides <code>4n^2 + 1;</code> alternately, numbers which are <code>4, 9, 56</code>, or <code>61 mod 65</code>.
 * @author Sean A. Irvine
 */
public class A203464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203464() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {4, 9, 56, 61, 69});
  }
}
