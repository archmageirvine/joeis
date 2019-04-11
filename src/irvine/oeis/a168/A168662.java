package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168662 <code>a(n) = n^7*(n^5 + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A168662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168662() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 1, 2112, 266814, 8396800, 122109375, 1088531136, 6921055372L, 34360786944L, 141217159725L, 500005000000L, 1569223931946L, 4458068140032L});
  }
}
