package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071930 Number of words of length <code>2n</code> in the two letters s and t that reduce to the identity 1 by using the relations ssTT=1, ststSS=1 and ststTT=1, where S and T are the inverses of s and t, respectively <code>(i</code>.e., sS=1 and tT=1). The generators s and t and the three stated relations generate the quaternion group Q4.
 * @author Sean A. Irvine
 */
public class A071930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071930() {
    super(new long[] {8, 2}, new long[] {0, 6});
  }
}
