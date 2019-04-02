package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212670 a(n) = 1/15*(128*n^5 + 320*n^4 + 80*n^3 - 200*n^2 + 92*n - 15).
 * @author Sean A. Irvine
 */
public class A212670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212670() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {27, 615, 3843, 14351, 40363, 94711});
  }
}
