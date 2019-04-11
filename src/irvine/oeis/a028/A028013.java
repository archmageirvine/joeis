package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028013 Expansion of <code>1/((1-2x)(1-7x)(1-10x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A028013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028013() {
    super(new long[] {-1680, 1388, -332, 31}, new long[] {1, 31, 629, 10595});
  }
}
