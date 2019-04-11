package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092093 Back and Forth Summant S(n, _5): <code>a(n) =</code> sum_{i <code>= 0</code>..floor(2n/5)} n-5i.
 * @author Sean A. Irvine
 */
public class A092093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092093() {
    super(new long[] {-1, 0, 0, 0, 0, 2, 0, 0, 0, 0}, new long[] {1, 2, 1, 3, 0, 3, 6, 2, 6, 0});
  }
}
