package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016880.
 * @author Sean A. Irvine
 */
public class A016880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016880() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {256, 5764801, 429981696, 6975757441L, 54875873536L, 282429536481L, 1099511627776L, 3512479453921L, 9682651996416L});
  }
}
