package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137824 Index at which A137823(n) occurs first in A137822 (gaps in numbers m such that 3 | sum( Catalan(k), <code>k=1.</code>.2m)).
 * @author Sean A. Irvine
 */
public class A137824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137824() {
    super(new long[] {4, 0, 0}, new long[] {1, 3, 2});
  }
}
