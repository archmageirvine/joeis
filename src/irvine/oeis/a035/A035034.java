package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a034.A034884;

/**
 * A035034 Numbers k such that k &gt;= d(k)^2, where d(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A035034 extends ComplementSequence {

  /** Construct the sequence. */
  public A035034() {
    super(new A034884(), Z.ONE);
  }
}
