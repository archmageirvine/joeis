package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071930 Number of words of length <code>2n</code> in the two letters s and t that reduce to the identity 1 by using the relations <code>ssTT=1, ststSS=1</code> and <code>ststTT=1</code>, where S and T are the inverses of s and t, respectively <code>(i.e., sS=1</code> and <code>tT=1)</code>. The generators s and t and the three stated relations generate the quaternion group <code>Q4</code>.
 * @author Sean A. Irvine
 */
public class A071930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071930() {
    super(new long[] {8, 2}, new long[] {0, 6});
  }
}
