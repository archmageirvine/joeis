package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017337 a(n) = (10*n + 5)^9.
 * @author Sean A. Irvine
 */
public class A017337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017337() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1953125, 38443359375L, 3814697265625L, 78815638671875L, 756680642578125L, 4605366583984375L, 20711912837890625L, 75084686279296875L, 231616946283203125L, 630249409724609375L});
  }
}
