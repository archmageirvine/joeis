package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228748 Pell numbers (A000129) minus Lucas numbers beginning at 2 (A000032).
 * @author Sean A. Irvine
 */
public class A228748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228748() {
    super(new long[] {-1, -3, 0, 3}, new long[] {-2, 0, -1, 1});
  }
}
