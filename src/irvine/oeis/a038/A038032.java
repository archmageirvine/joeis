package irvine.oeis.a038;

import irvine.oeis.FilterPositionSequence;

/**
 * A038032 A038025(n)=1.
 * @author Sean A. Irvine
 */
public class A038032 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A038032() {
    super(1, new A038025(), 1);
  }
}
