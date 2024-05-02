package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000040;

/**
 * A069469 Numbers n such that prime(reversal(n)) = reversal(prime(n)). Ignore leading 0's.
 * @author Sean A. Irvine
 */
public class A069469 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A069469() {
    super(1, 1, new A000040(), (n, p) -> Functions.REVERSE.z(p).equals(Functions.PRIME.z(Functions.REVERSE.l(n))));
  }
}

