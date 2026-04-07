package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a381.A381466;

/**
 * A391446 Numbers k such that gcd(A381466(k-1),k) &gt; 1.
 * @author Sean A. Irvine
 */
public class A391446 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A391446() {
    super(1, 1, new A381466(), (n, k) -> Functions.GCD.z(n, k).compareTo(Z.ONE) > 0);
  }
}

