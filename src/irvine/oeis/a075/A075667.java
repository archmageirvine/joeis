package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075667 Sum of next <code>n 6th</code> powers.
 * @author Sean A. Irvine
 */
public class A075667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075667() {
    super(new long[] {-1, 14, -91, 364, -1001, 2002, -3003, 3432, -3003, 2002, -1001, 364, -91, 14}, new long[] {1, 793, 66377, 1911234, 28504515, 271739011, 1874885963, 10136389172L, 45311985069L, 173957200405L, 589679082421L, 1802148522758L, 5045944649967L, 13108508706879L});
  }
}
