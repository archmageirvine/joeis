package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103196 a(n) = (1/9)(2^(n+3)-(-1)^n(3n-1)).
 * @author Sean A. Irvine
 */
public class A103196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103196() {
    super(new long[] {2, 3, 0}, new long[] {1, 2, 3});
  }
}
