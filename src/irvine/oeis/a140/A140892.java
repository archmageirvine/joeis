package irvine.oeis.a140;
// manually 2024-04-11/simtraf at 2024-04-11 21:12

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A140892 a(n) = (n-1)^F(n) - F(n)^(n-1), where F(n) = A000045(n).
 * @author Georg Fischer
 */
public class A140892 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A140892() {
    super(1, new A000045().skip(1), (n, v) -> Z.valueOf(n - 1).pow(v).subtract(v.pow(n - 1)));
  }
}
