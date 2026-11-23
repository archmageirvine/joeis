package irvine.oeis.a385;

import irvine.math.BinaryLambdaOracle;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a333.A333479;

/**
 * A385712 Busy Beaver BBlambda_1 for lambda calculus with a BB (A333479) oracle: the maximum beta/oracle normal form size of any 1-closed lambda term of size n, or 0 if no 1-closed term of size n exists.
 * @author Sean A. Irvine
 */
public class A385712 extends Sequence1 {

  private int mN;

  @Override
  public Z next() {
    return BinaryLambdaOracle.maximum(++mN, A333479::maximum);
  }
}
