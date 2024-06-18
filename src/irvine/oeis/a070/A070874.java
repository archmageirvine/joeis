package irvine.oeis.a070;

import irvine.oeis.FilterPositionSequence;

/**
 * A070837.
 * @author Sean A. Irvine
 */
public class A070874 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A070874() {
    super(1, 1, new A070871(), (n, k) -> k.compareTo(n) < 0);
  }
}
