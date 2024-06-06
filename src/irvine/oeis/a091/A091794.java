package irvine.oeis.a091;
// manually 2024-05-29/multraf at 2024-06-06 18:57

import irvine.math.function.Functions;
import irvine.oeis.a061.A061431;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A091794 First column of A091793.
 * @author Georg Fischer
 */
public class A091794 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A091794() {
    super(0, (self, n) -> self.s(0).add(Functions.TRIANGULAR.z(n - 1)).add(1), "2", new A061431());
    next();
  }
}
