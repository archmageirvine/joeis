package irvine.oeis.a388;

import irvine.oeis.a336.A336282;
import irvine.util.Permutation;

/**
 * A388138 allocated for Manolopoulos Panagiotis.
 * @author Sean A. Irvine
 */
public class A388138 extends A336282 {

  /** Construct the sequence. */
  public A388138() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    return Permutation.inversions(p);
  }
}
