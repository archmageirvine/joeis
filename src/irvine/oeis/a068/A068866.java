package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A068866 Triangular numbers k*(k+1)/2 such that A068865(k) = k*(k+1)/2.
 * @author Sean A. Irvine
 */
public class A068866 extends FilterSequence {

  /** Construct the sequence. */
  public A068866() {
    super(1, new A068865(), (k, v) -> v.equals(Z.valueOf(k).multiply(k + 1).divide2()));
  }
}
