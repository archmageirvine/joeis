package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189800 <code>a(n) = 6*a(n-1) + 8*a(n-2)</code>, with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A189800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189800() {
    super(new long[] {8, 6}, new long[] {0, 1});
  }
}
