package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014937 a(1)=1, a(n)=n*20^(n-1)+a(n-1).
 * @author Sean A. Irvine
 */
public class A014937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014937() {
    super(1, new long[] {400, -440, 41}, new long[] {1, 41, 1241});
  }
}
