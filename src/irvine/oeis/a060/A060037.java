package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.triangle.DoubleRowTriangle;

/**
 * A060037 Triangular array T read by rows: T(n,k)=k^2 mod n, for k=1,2,...,[n/2], n=2,3,...
 * @author Georg Fischer
 */
public class A060037 extends DoubleRowTriangle {

  /** Construct the sequence. */
  public A060037() {
    setOffset(2);
  }

  @Override
  public Z compute(int n, int k) {
    n += 2;
    ++k;
    return n <= 3 ? Z.ONE : Z.valueOf((k * k) % n);
  }
}
