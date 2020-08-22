package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104095 Let v[0]={0,1,1,2}, v[n]=M.v[n-1], where M={{0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}, {1, 10, 19, 1}}; then a(n) =v[n][[1]] (the first term).
 * @author Sean A. Irvine
 */
public class A104095 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104095() {
    super(new long[] {1, 10, 19, 1}, new long[] {0, 1, 1, 2});
  }
}
