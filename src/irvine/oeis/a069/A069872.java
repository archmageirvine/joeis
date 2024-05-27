package irvine.oeis.a069;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a037.A037278;

/**
 * A069872 Numbers k such that k divides the concatenation all divisors in ascending order, i.e., k divides A037278(k).
 * @author Sean A. Irvine
 */
public class A069872 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A069872() {
    super(1, 1, new A037278(), (n, k) -> k.mod(n) == 0);
  }
}

