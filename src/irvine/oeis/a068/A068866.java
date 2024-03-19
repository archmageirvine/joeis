package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A068853.
 * @author Sean A. Irvine
 */
public class A068866 extends FilterSequence {

  /** Construct the sequence. */
  public A068866() {
    super(1, new A068865(), (k, v) -> v.equals(Z.valueOf(k).multiply(k + 1).divide2()));
  }
}
