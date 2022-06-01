package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154323 Central coefficients of number triangle A113582.
 * @author Sean A. Irvine
 */
public class A154323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154323() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2, 10, 37, 101});
  }
}
