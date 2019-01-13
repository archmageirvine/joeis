package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016776.
 * @author Sean A. Irvine
 */
public class A016776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016776() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 531441, 2176782336L, 282429536481L, 8916100448256L, 129746337890625L, 1156831381426176L, 7355827511386641L, 36520347436056576L, 150094635296999121L, 531441000000000000L, 1667889514952984961L, 4738381338321616896L});
  }
}
