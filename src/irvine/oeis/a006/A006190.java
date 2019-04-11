package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006190 <code>a(n) = 3*a(n-1) + a(n-2),</code> with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A006190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006190() {
    super(new long[] {1, 3}, new long[] {0, 1});
  }
}

