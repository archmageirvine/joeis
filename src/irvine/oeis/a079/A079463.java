package irvine.oeis.a079;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002295;

/**
 * A079463 Numbers k such that C(6*k,n)/(5*k+1) (A002295) is not divisible by 6.
 * @author Sean A. Irvine
 */
public class A079463 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A079463() {
    super(1, 0, new A002295(), k -> k.mod(6) != 0);
  }
}
