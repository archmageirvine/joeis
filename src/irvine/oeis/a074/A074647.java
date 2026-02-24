package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A074647 Numbers k such that A074639(k) and A000010(k) are coprime.
 * @author Sean A. Irvine
 */
public class A074647 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074647() {
    super(1, 1, new A074639().skip(), (n, k) -> Functions.GCD.z(k, Functions.PHI.z(n)).isOne());
  }
}
