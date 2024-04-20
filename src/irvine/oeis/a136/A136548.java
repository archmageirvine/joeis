package irvine.oeis.a136;
// manually knest/jaguar at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A136548 a(n) = max {k &gt;= 1 | sigma(k) &lt;= n}.
 * @author Georg Fischer
 */
public class A136548 extends Sequence1 {

  private final A000142 mSeq = new A000142();

  @Override
  public Z next() {
    return Functions.GPF.z(mSeq.next());
  }
}
