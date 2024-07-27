package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a065.A065876;

/**
 * A071557 Numbers k such that A065876(k) = k^2-k+1.
 * @author Sean A. Irvine
 */
public class A071557 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071557() {
    super(1, 0, new A065876(), (n, k) -> k.equals(Z.valueOf(n).square().subtract(n - 1)));
  }
}
