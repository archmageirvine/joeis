package irvine.oeis.a049;

import irvine.oeis.DifferenceSequence;

/**
 * A049998 a(n) = b(n)-b(n-1), where b=A049997 are numbers of the form Fibonacci(i)*Fibonacci(j).
 * @author Sean A. Irvine
 */
public class A049998 extends DifferenceSequence {

  /** Construct the sequence. */
  public A049998() {
    super(1, new A049997());
  }
}
