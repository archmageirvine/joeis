package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002808;

/**
 * A073258 Numbers n such that gcd(c(n),n) = gcd(A002808(n),n) = A064814(n)=1 where c(n) is the n-th composite number.
 * @author Sean A. Irvine
 */
public class A073258 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073258() {
    super(1, 1, new A002808(), (n, k) -> Functions.GCD.l(n, k) == 1);
  }
}

