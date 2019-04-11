package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016764 <code>a(n) = (2*n+1)^12</code>.
 * @author Sean A. Irvine
 */
public class A016764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016764() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 531441, 244140625, 13841287201L, 282429536481L, 3138428376721L, 23298085122481L, 129746337890625L, 582622237229761L, 2213314919066161L, 7355827511386641L, 21914624432020321L, 59604644775390625L});
  }
}
