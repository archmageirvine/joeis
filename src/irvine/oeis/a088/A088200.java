package irvine.oeis.a088;

import irvine.oeis.FilterSequence;

/**
 * A088200 Members of the difference sequence (A088197) of LQnR(p_n) (A088196) where it is &lt;= 0.
 * @author Sean A. Irvine
 */
public class A088200 extends FilterSequence {

  /** Construct the sequence. */
  public A088200() {
    super(1, new A088197(), k -> k.signum() <= 0);
  }
}

