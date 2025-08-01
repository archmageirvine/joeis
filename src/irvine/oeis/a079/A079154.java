package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a004.A004154;

/**
 * A079154 Numbers k such that reverse(A004154(k)) - 1 is prime.
 * @author Sean A. Irvine
 */
public class A079154 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A079154() {
    super(1, 0, new A004154(), k -> Functions.REVERSE.z(k).subtract(1).isProbablePrime());
  }
}

