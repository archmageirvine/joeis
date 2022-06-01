package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006190 a(n) = 3*a(n-1) + a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A006190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006190() {
    super(new long[] {1, 3}, new long[] {0, 1});
  }
}

