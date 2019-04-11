package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020577 Expansion of <code>1/((1-6x)(1-7x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A020577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020577() {
    super(new long[] {504, -198, 25}, new long[] {1, 25, 427});
  }
}
