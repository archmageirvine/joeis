package irvine.oeis.a078;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002293;

/**
 * A078971 Numbers n such that C(4n,n)/(3n+1) (A002293) is not divisible by 4.
 * @author Sean A. Irvine
 */
public class A078971 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A078971() {
    super(1, 0, new A002293(), k -> k.mod(4) != 0);
  }
}

