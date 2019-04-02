package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106565 Let M={{0, 5}, {1, 5}}, v[n]=M.v[n-1]; then a(n) =v[n][[1]].
 * @author Sean A. Irvine
 */
public class A106565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106565() {
    super(new long[] {5, 5}, new long[] {0, 5});
  }
}
