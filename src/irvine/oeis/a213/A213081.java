package irvine.oeis.a213;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A213081 Exclusive-or based Pascal triangle, read by rows: T(n,1)=T(n,n)=n and T(n,k) = T(n-1,k-1) XOR T(n-1,k), where XOR is the bitwise exclusive-or operator.
 * T(n, 1)=T(n,n)=n and T(n,k) = T(n-1,k-1) XOR T(n-1,k), where XOR is the bitwise exclusive-or operator.
 * @author Georg Fischer
 */
public class A213081 extends Triangle {

  /** Construct the sequence. */
  public A213081() {
    setOffset(1);
    hasRAM(false);
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 || k == n ? Z.valueOf(n + 1) : get(n - 1, k - 1).xor(get(n - 1, k));
  }
}
