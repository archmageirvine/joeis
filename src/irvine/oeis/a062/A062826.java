package irvine.oeis.a062;

import irvine.oeis.FilterSequence;
import irvine.oeis.a028.A028822;

/**
 * A062826 Square nialpdromes not ending in 0.
 * @author Sean A. Irvine
 */
public class A062826 extends FilterSequence {

  /** Construct the sequence. */
  public A062826() {
    super(1, new A028822(), k -> k.mod(10) != 0);
  }
}
