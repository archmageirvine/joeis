package irvine.oeis.a113;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A113271 Ascending descending base exponent transform of 2^n.
 * a(n)=sum(i=0,n,(2^i)^(2^(n-i)))
 * @author Georg Fischer
 */
public class A113271 extends LambdaSequence {

  /** Construct the sequence. */
  public A113271() {
    super(0, n -> Integers.SINGLETON.sum(0, n, i -> Z.ONE.shiftLeft(i).pow(Z.ONE.shiftLeft(n - i))));
  }
}
