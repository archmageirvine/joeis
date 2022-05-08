package irvine.oeis.a176;

import irvine.math.z.Z;
import irvine.oeis.triangle.MemoryUpperLeftTriangle;

/**
 * A176129 Number A(n,k) of solid standard Young tableaux of shape [[n*k,n],[n]]; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A176129 extends MemoryUpperLeftTriangle<Z> {

  /** Construct the sequence. */
  public A176129() {
    super(0, 0, -1);
  }

  /* Maple programs:
    b:= proc(x, y, z) option remember; `if`(z>y, b(x, z, y), `if`(z>x, 0,
      `if`({x, y, z}={0}, 1, `if`(x>y and x>z, b(x-1, y, z), 0)+
      `if`(y>0, b(x, y-1, z), 0)+ `if`(z>0, b(x, y, z-1), 0))))
    end:
    A:= (n, k)-> b(n*k, n, n):
    seq(seq(A(n, d-n), n=0..d), d=0..8);
  */
  @Override
  protected Z calculate(final int x, final int y, final int z) {
    if (z > y) {
      return retrieve(x, z, y);
    }
    if (z > x) {
      return Z.ZERO;
    }
    if (x == 0 && y == 0 && z == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    if (x > y && x > z) {
      sum = sum.add(retrieve(x - 1, y, z));
    }
    if (y > 0) {
      sum = sum.add(retrieve(x, y - 1, z));
    }
    if (z > 0) {
      sum = sum.add(retrieve(x, y, z - 1));
    }
    return sum;
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return retrieve(n * k, n, n);
  }
}
