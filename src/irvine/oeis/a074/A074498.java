package irvine.oeis.a074;

import irvine.oeis.FilterSequence;

/**
 * A074228.
 * @author Sean A. Irvine
 */
public class A074498 extends FilterSequence {

  /** Construct the sequence. */
  public A074498() {
    super(1, new A074368(), (n, k) -> k.divide2().longValueExact() == n - 1);
  }
}
