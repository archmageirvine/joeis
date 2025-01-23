package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002034;

/**
 * A070049.
 * @author Sean A. Irvine
 */
public class A074583 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074583() {
    super(1, 1, new A002034(), (n, k) -> n == 1 || Functions.SOPFR.z(n).equals(k));
  }
}
