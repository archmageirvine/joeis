package irvine.oeis.a060;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;

/**
 * A060392 Let f(m) = smallest prime that divides k^2 + k + m for k = 0,1,2,...; sequence gives smallest m &gt;= 0 such that f(m) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A060392 extends PrependSequence {

  /** Construct the sequence. */
  public A060392() {
    super(1, new SkipSequence(new A060380(), 2), 0, 1);
  }
}
