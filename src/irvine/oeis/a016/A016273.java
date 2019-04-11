package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016273 Expansion of <code>1/((1-2x)(1-3x)(1-5x))</code>.
 * @author Sean A. Irvine
 */
public class A016273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016273() {
    super(new long[] {30, -31, 10}, new long[] {1, 10, 69});
  }
}
