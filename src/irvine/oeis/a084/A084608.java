package irvine.oeis.a084;
// Generated by gen_seq4.pl 2024-03-10/tablamb at 2024-03-15 23:35

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTable;

/**
 * A084608 Triangle, read by rows, where the n-th row lists the (2n+1) coefficients of (1+2*x+3*x^2)^n.
 * @author Georg Fischer
 */
public class A084608 extends LambdaTable {

  /** Construct the sequence. */
  public A084608() {
    super(0, 0, n -> new Integer[]{0, n * 2}, (n, k) -> Integers.SINGLETON.sum(0, k, j -> Binomial.binomial(n, k - j).multiply(Binomial.binomial(k - j, j)).multiply(Z.TWO.pow(k - 2L * j)).multiply(Z.THREE.pow(j))));
  }
}
