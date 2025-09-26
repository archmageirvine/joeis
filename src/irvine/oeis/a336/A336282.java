package irvine.oeis.a336;

import irvine.oeis.a388.A388139;

/**
 * A336282 Number of heapable permutations of length n.
 * @author Sean A. Irvine
 */
public class A336282 extends A388139 {

  /** Construct the sequence. */
  public A336282() {
    super(0);
  }

  @Override
  protected long contribution(final int[] p) {
    return 1;
  }
}
