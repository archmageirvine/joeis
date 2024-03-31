package irvine.oeis.a069;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A069036.
 * @author Sean A. Irvine
 */
public class A069041 extends FilterSequence {

  /** Construct the sequence. */
  public A069041() {
    super(1, new A000045().skip(), k -> Integer.bitCount(ZUtils.syn(k)) <= 2);
  }
}

