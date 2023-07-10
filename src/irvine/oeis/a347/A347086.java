package irvine.oeis.a347;
// manually at 2023-07-09 21:27

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A347086 Difference between the Dirichlet inverse of -A168036, n - A003415(n) and the Dirichlet inverse of A129283, n + A003415(n), where A003415 is the Arithmetic derivative of n.
 * @author Georg Fischer
 */
public class A347086 extends Sequence1 {

  private final A347082 mSeq1 = new A347082();
  private final A347084 mSeq2 = new A347084();

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
