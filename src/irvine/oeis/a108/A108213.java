package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108213 <code>a(0)=44</code>; if n odd, <code>a(n) = a(n-1)/2</code>, otherwise <code>a(n) = 4*a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A108213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108213() {
    super(new long[] {2, 0}, new long[] {44, 22});
  }
}
