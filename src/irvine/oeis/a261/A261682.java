package irvine.oeis.a261;
// manually 2023-12-24/lambdan at 2023-12-26 12:51

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A261682 a(n) = 2^n+(1+(n mod 2)/2)*C(n+1,floor((n+(n mod 2))/2))-1.
 * @author Georg Fischer
 */
public class A261682 extends LambdaSequence {

  /** Construct the sequence. */
  public A261682() {
    super(0, n -> Z.TWO.pow(n).add(Binomial.binomial(n + 1, (n + n % 2) / 2).multiply(2 + n % 2).divide(2)).subtract(1));
  }
}
