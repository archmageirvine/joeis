package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111641 Expansion of -(1+x+3*x^2+x^3)/((x^2+4*x+1)*(x^2-2*x-1)).
 * @author Sean A. Irvine
 */
public class A111641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111641() {
    super(new long[] {1, 2, -8, -6}, new long[] {1, -5, 25, -107});
  }
}
