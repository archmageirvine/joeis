package irvine.oeis.a307;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A307728 Sum of the perimeters of all acute integer triangles with perimeter n.
 * a(n)=n*sum(k=1,floor(n/3),sum(i=k,floor((n-k)/2),(1-sign(floor((n-i-k)^2/(i^2+k^2))))*sign(floor((i+k)/(n-i-k+1)))))
 * @author Georg Fischer
 */
public class A307728 extends LambdaSequence {

  /** Construct the sequence. */
  public A307728() {
    super(1, n -> Z.valueOf(n).multiply(Integers.SINGLETON.sum(1, n / 3, k -> Integers.SINGLETON.sum(k, (n - k) / 2, i -> Z.ONE.subtract(Z.valueOf(n - i - k).square().divide(Z.valueOf((long) i * i + (long) k * k)).signum()).multiply(Z.valueOf(i + k).divide(Z.valueOf(n - i - k + 1)).signum())))));
  }
}
