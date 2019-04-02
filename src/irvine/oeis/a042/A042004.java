package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042004 Numerators of continued fraction convergents to sqrt(525).
 * @author Sean A. Irvine
 */
public class A042004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042004() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 12098, 0, 0, 0, 0, 0}, new long[] {22, 23, 252, 527, 5522, 6049, 271678, 277727, 3048948, 6375623, 66805178, 73180801});
  }
}
