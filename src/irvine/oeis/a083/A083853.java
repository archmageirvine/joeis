package irvine.oeis.a083;

import irvine.oeis.InverseSequence;
import irvine.oeis.a000.A000121;

/**
 * A083853 Smallest nonnegative integer that can be written as a sum of Fibonacci numbers in n ways, counting 1 twice as Fibonacci number.
 * @author Sean A. Irvine
 */
public class A083853 extends InverseSequence {

  /** Construct the sequence. */
  public A083853() {
    super(1, new A000121());
  }
}
