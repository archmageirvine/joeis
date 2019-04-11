package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024166 <code>a(n) =</code> Sum_{1 <code>&lt;=</code> i &lt; j <code>&lt;= n}</code> (j-i)^3.
 * @author Sean A. Irvine
 */
public class A024166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024166() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 10, 46, 146, 371});
  }
}
