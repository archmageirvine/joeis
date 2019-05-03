package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009930 Coordination sequence for <code>MgCu2</code>, Cu position.
 * @author Sean A. Irvine
 */
public class A009930 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009930() {
    super(
      new long[] {1, 12, 48, 83, 80, -8, -157, -296, -253, -7, 248, 307, 206, -10, -113, -100, -40, -5, 4},
      new int[] {2, 2, 3, 3, 3, 4});
  }
}
