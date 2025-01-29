package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a035.A035250;

/**
 * A064353.
 * @author Sean A. Irvine
 */
public class A074810 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074810() {
    super(1, 1, new A035250(), (n, k) -> k.equals(Functions.GPF.z(n)));
  }
}
