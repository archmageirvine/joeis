package irvine.oeis.a152;

import irvine.math.z.Z;

/**
 * A152601 a(n) = Sum_{k=0..n} C(n+k,2k)*A000108(k)*3^k*2^(n-k).
 * @author Georg Fischer
 */
public class A152601 extends A152600 {

  /** Construct the sequence. */
  public A152601() {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
