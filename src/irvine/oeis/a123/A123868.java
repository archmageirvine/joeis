package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123868 <code>a(n) = n^12 - 1</code>.
 * @author Sean A. Irvine
 */
public class A123868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123868() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 4095, 531440, 16777215, 244140624, 2176782335L, 13841287200L, 68719476735L, 282429536480L, 999999999999L, 3138428376720L, 8916100448255L, 23298085122480L});
  }
}
