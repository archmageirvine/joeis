package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028288 Molien series for complex 4-dimensional Clifford group of order 92160 and genus 2. Also Molien series of ring of biweight enumerators of Type II self-dual binary codes.
 * @author Sean A. Irvine
 */
public class A028288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028288() {
    super(new long[] {-1, 1, 0, 2, -2, 1, -2, 1, -2, 2, 0, 1}, new long[] {1, 1, 1, 3, 4, 5, 8, 10, 12, 17, 21, 24});
  }
}
