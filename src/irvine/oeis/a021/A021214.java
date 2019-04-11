package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021214 Expansion of <code>1/((1-x)(1-2x)(1-6x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A021214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021214() {
    super(new long[] {-144, 252, -128, 21}, new long[] {1, 21, 313, 4137});
  }
}
