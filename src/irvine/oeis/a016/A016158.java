package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016158 Expansion of <code>1/((1-4*x)(1-11*x))</code>.
 * @author Sean A. Irvine
 */
public class A016158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016158() {
    super(new long[] {-44, 15}, new long[] {1, 15});
  }
}
