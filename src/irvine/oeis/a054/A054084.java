package irvine.oeis.a054;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a000.A000201;
import irvine.oeis.a001.A001950;

/**
 * A054084 Permutation of N: for each k &gt;= 1, let p(k)=least natural number not already an a(i), q(k)=p(k)+k, a(2k-1)=q(k), a(2k)=p(k).
 * @author Sean A. Irvine
 */
public class A054084 extends AlternatingSequence {

  /** Construct the sequence. */
  public A054084() {
    super(new A001950(), new A000201());
  }
}
