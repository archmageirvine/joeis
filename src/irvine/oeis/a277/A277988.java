package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277988 <code>a(n) = 352*2^n + 34</code>.
 * @author Sean A. Irvine
 */
public class A277988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277988() {
    super(new long[] {-2, 3}, new long[] {386, 738});
  }
}
