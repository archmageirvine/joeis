package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016166 Expansion of <code>1/((1-5x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A016166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016166() {
    super(new long[] {-60, 17}, new long[] {1, 17});
  }
}
