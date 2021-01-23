package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104270 a(n) = 2^(n-2)*(C(n,2)+2).
 * @author Sean A. Irvine
 */
public class A104270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104270() {
    super(new long[] {8, -12, 6}, new long[] {1, 3, 10});
  }
}
