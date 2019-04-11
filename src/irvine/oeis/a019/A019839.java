package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019839 Expansion of <code>1/((1-5x)(1-6x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A019839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019839() {
    super(new long[] {300, -140, 21}, new long[] {1, 21, 301});
  }
}
