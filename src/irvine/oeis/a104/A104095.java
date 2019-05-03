package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104095 Let <code>v[0]={0,1,1,2}, v[n]=M.v[n-1]</code>, where <code>M={{0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}, {1, 10, 19, 1}}</code>; then <code>a(n) =v[n][[1]]</code> (the first term).
 * @author Sean A. Irvine
 */
public class A104095 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104095() {
    super(new long[] {1, 10, 19, 1}, new long[] {0, 1, 1, 2});
  }
}
