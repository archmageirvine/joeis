package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017180 <code>(9n+1)^8</code>.
 * @author Sean A. Irvine
 */
public class A017180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017180() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 100000000, 16983563041L, 377801998336L, 3512479453921L, 20047612231936L, 83733937890625L, 281474976710656L, 806460091894081L});
  }
}
