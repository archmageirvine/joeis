package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042156 Numerators of continued fraction convergents to sqrt(603).
 * @author Sean A. Irvine
 */
public class A042156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042156() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 97684, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {24, 25, 49, 172, 221, 5255, 5476, 21683, 27159, 48842, 2371575, 2420417, 4791992, 16796393, 21588385, 513329248, 534917633, 2118082147, 2652999780L, 4771081927L});
  }
}
