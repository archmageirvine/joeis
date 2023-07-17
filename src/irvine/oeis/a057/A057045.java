package irvine.oeis.a057;
// manually A057036/parmof4 at 2023-07-17 09:13

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A057045 Let R(i,j) be the rectangle with antidiagonals 1; 2,3; 4,5,6; ...; the n-th Lucas number is in antidiagonal a(n).
 * @author Georg Fischer
 */
public class A057045 extends A057036 {

  protected int mN = 0;

  /** Construct the sequence. */
  public A057045() {
    super(1, new A000032(), 3, 0);
  }

  /* Python:
    i, j = isqrt_rem(2*lucas(n-1))
    return int(i + int(4*(j-i) >= 1))
  */
  @Override
  public Z next() {
    ++mN;
    final Z[] ij = mSeq.next().multiply2().sqrtAndRemainder();
    return ij[0].add((ij[1].subtract(ij[0]).multiply(4).compareTo(Z.ONE) >= 0) ? Z.ONE : Z.ZERO);
  }
}

