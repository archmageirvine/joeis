package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137824 Index at which <code>A137823(n)</code> occurs first in <code>A137822 (gaps</code> in numbers m such that <code>3 | sum( Catalan(k), k=1..2m))</code>.
 * @author Sean A. Irvine
 */
public class A137824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137824() {
    super(new long[] {4, 0, 0}, new long[] {1, 3, 2});
  }
}
