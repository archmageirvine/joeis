package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206723 a(n) = 7*( ((3 + sqrt(5))/2)^n + ((3 - sqrt(5))/2)^n - 2 ).
 * @author Sean A. Irvine
 */
public class A206723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206723() {
    super(new long[] {1, -4, 4}, new long[] {7, 35, 112});
  }
}
