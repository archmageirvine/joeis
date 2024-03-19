package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A068853.
 * @author Sean A. Irvine
 */
public class A068867 extends FilterSequence {

  /** Construct the sequence. */
  public A068867() {
    super(1, new A068864(), (k, v) -> v.equals(Z.valueOf(k).square()));
  }
}
