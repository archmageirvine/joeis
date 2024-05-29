package irvine.oeis.a090;
// manually exprs/lambda at 2024-05-28 20:38

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A090701 a(n) is the minimal number k such that every binary word of length n can be divided into k palindromes.
 * @author Georg Fischer
 */
public class A090701 extends LambdaSequence {

  /** Construct the sequence. */
  public A090701() {
    super(1, n -> (n == 11) ? Z.FIVE : Z.valueOf(n / 6).add(Z.valueOf(n + 4).divide(Z.SIX)).add(Z.ONE));
  }
}
