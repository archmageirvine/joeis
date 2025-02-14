package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.triangle.Diagonal;

/**
 * A218272 Infinitesimal generator for transpose of the Pascal matrix A007318 (as upper triangular matrices).
 * @author Georg Fischer
 */
public class A218272 extends Diagonal {

  /** Construct the sequence. */
  public A218272() {
    super(0, n -> Z.valueOf((n == 0) ? 1 : n));
    next();
  }
}

