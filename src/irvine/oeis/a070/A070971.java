package irvine.oeis.a070;

import irvine.oeis.InverseSequence;

/**
 * A070971 a(n) is the smallest positive integer m for which A070194(m) (i.e., the maximal gap in {k|gcd(k,m) = 1, 1 &lt;= k &lt;= m-1}) is n.
 * @author Sean A. Irvine
 */
public class A070971 extends InverseSequence {

  /** Construct the sequence. */
  public A070971() {
    super(1, new A070194());
  }
}
