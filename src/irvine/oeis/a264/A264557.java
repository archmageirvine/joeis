package irvine.oeis.a264;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A264557 Number of n X 1 arrays of permutations of 0..n*1-1 with rows nondecreasing modulo 2 and columns nondecreasing modulo 3.
 * a(n)=prod(i=0,2,floor((n+i)/3)!)
 * @author Georg Fischer
 */
public class A264557 extends LambdaSequence {

  /** Construct the sequence. */
  public A264557() {
    super(1, n -> Integers.SINGLETON.product(0, 2, i -> Functions.FACTORIAL.z(Z.valueOf(n + i).divide(Z.THREE))));
  }
}
