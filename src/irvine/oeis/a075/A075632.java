package irvine.oeis.a075;

import irvine.oeis.PrependSequence;
import irvine.oeis.SelfQuotientSequence;

/**
 * A075632 a(1) = 1, then {sum of terms of the n-th group in A075631}/{sum of (n-1)-th group}.
 * @author Sean A. Irvine
 */
public class A075632 extends SelfQuotientSequence {

  /** Construct the sequence. */
  public A075632() {
    super(1, new PrependSequence(new A075631(), 1));
  }
}
