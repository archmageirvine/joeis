package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218744 <code>a(n) = (41^n-1)/40</code>.
 * @author Sean A. Irvine
 */
public class A218744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218744() {
    super(new long[] {-41, 42}, new long[] {0, 1});
  }
}
