package irvine.oeis.a088;

import irvine.oeis.recur.GeneralRecurrence;

/**
 * A088567 Number of "non-squashing" partitions of n into distinct parts.
 * @author Georg Fischer
 */
public class A088567 extends GeneralRecurrence {

  /** Construct the sequence. */
  public A088567() {
    super(0, 1, 1);
  }

  @Override
  protected void initialize() {
    // a(0)=1, a(1)=1; and for m >= 1, a(2m) = a(2m-1) + a(m) - 1, a(2m+1) = a(2m) + 1.
    mLambda.add(m -> a(2 * m - 1).add(a(m)).subtract(1));
    mLambda.add(m -> a(2 * m).add(1));
  }
}
