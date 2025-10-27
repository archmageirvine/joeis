package irvine.oeis.a389;

import irvine.oeis.a336.A336282;
import irvine.util.Permutation;

/**
 * A389991 allocated for Manolopoulos Panagiotis.
 * @author Sean A. Irvine
 */
public class A389991 extends A336282 {

  /** Construct the sequence. */
  public A389991() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    return Permutation.countDescents(p);
  }
}
