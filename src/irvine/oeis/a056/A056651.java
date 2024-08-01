package irvine.oeis.a056;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.PrependSequence;

/**
 * A056651 Numbers k such that binomial(k,floor(k/2)) has no non-unitary square divisors: all of their square divisors are unitary ones.
 * @author Sean A. Irvine
 */
public class A056651 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A056651() {
    super(0, new PrependSequence(new A056649(), 0), 0);
  }
}
