package irvine.oeis.a303;
// Generated by gen_seq4.pl 2024-05-25/lambdan at 2024-05-25 23:20

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A303278 If n = Product_j p_j^k_j where the p_j are distinct primes then a(n) = (Product_j k_j)^(Product_j p_j).
 * @author Georg Fischer
 */
public class A303278 extends LambdaSequence {

  /** Construct the sequence. */
  public A303278() {
    super(1, n -> Functions.TAU.z(Z.valueOf(n).divide(Jaguar.factor(n).squareFreeKernel())).pow(Jaguar.factor(n).squareFreeKernel()));
  }
}
