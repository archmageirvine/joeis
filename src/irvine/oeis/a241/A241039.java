package irvine.oeis.a241;
// manually 2023-09-07/lambda at 2023-09-07 19:13

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.LambdaSequence;

/**
 * A241039 Cyclotomic(n,2048).
 * @author Georg Fischer
 */
public class A241039 extends LambdaSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A241039() {
    super(0, n -> Cyclotomic.cyclotomic(n, Z.valueOf(2048)));
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    return (mN == 0) ? Z.ONE : result;
  }
}
