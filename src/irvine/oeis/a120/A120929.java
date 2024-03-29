package irvine.oeis.a120;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A120929 Partial sums of n^(n^2), A002489.
 * a(n)=sum(i=0,n,i^(i^2))
 * @author Georg Fischer
 */
public class A120929 extends LambdaSequence {

  /** Construct the sequence. */
  public A120929() {
    super(0, n -> Integers.SINGLETON.sum(0, n, i -> Z.valueOf(i).pow((long) i * i)));
  }
}
