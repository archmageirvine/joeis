package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255985 <code>a(n) = 1</code> for <code>n &lt;= 6; a(n) = 49*a(n-1) - 882*a(n-2) + 8820*a(n-3) - 52920*a(n-4) + 190512*a(n-5) - 381024*a(n-6) + 326592*a(n-7)</code> otherwise.
 * @author Sean A. Irvine
 */
public class A255985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255985() {
    super(new long[] {326592, -381024, 190512, -52920, 8820, -882, 49}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}
