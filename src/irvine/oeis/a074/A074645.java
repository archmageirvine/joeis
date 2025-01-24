package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;

/**
 * A074645 Numbers k such that A000010(k) divides A074639(k).
 * @author Sean A. Irvine
 */
public class A074645 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074645() {
    super(1, 1, new A074639().skip(), (n, k) -> k.mod(Functions.PHI.l(n)) == 0);
  }
}
