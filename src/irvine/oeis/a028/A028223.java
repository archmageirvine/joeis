package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028223 Expansion of <code>1/((1-7x)(1-8x)(1-10x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A028223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028223() {
    super(new long[] {-6720, 3032, -506, 37}, new long[] {1, 37, 863, 16241});
  }
}
