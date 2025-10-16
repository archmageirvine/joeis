package irvine.oeis.a387;

import irvine.oeis.a336.A336282;
import irvine.util.Permutation;

/**
 * A386382.
 * @author Sean A. Irvine
 */
public class A387955 extends A336282 {

  /** Construct the sequence. */
  public A387955() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    return Permutation.majorIndex(p);
  }
}
