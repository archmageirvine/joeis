package irvine.oeis.a062;

import irvine.oeis.PrependSequence;
import irvine.oeis.a038.A038606;

/**
 * A062742 Index j of prime p(j) such that floor(p(j)/j) = n is first satisfied.
 * @author Sean A. Irvine
 */
public class A062742 extends PrependSequence {

  /** Construct the sequence. */
  public A062742() {
    super(1, new A038606().skip(2), 2, 1);
  }
}

