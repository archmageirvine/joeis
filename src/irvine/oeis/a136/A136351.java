package irvine.oeis.a136;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002110;

/**
 * A136351 Primorial numbers p# such that p# + 1 is a prime.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A136351 extends FilterSequence {

  /** Construct the sequence. */
  public A136351() {
    super(1, new A002110(), k -> k.add(1).isProbablePrime());
  }
}
