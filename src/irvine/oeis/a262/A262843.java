package irvine.oeis.a262;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A262843 Inverse Moebius transform of n^(n-1).
 * a(n)=sumdiv(n,d,d^(d-1))
 * @author Georg Fischer
 */
public class A262843 extends LambdaSequence {

  /** Construct the sequence. */
  public A262843() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d).pow(d - 1)));
  }
}
