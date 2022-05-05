package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A134446 A128174 * A002260.
 * @author Georg Fischer
 */
public class A134446 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A134446() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    // Maple: f := proc(n, k) floor(n) * floor((k+1)/2) end: seq(seq(f(n+1-k, k), k=n..1,-1), n=1..12);
    return Z.valueOf(n * ((k + 1) / 2));
  }
}
