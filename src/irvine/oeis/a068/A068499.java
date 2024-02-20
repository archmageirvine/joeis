package irvine.oeis.a068;

import irvine.oeis.PrependSequence;
import irvine.oeis.a006.A006093;

/**
 * A068499 Numbers m such that m! reduced modulo (m+1) is not zero.
 * @author Sean A. Irvine
 */
public class A068499 extends PrependSequence {

  /** Construct the sequence. */
  public A068499() {
    super(1, new A006093().skip(2), 1, 2, 3);
  }
}

