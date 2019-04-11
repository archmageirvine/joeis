package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016832 <code>a(n) = (4*n + 2)^8</code>.
 * @author Sean A. Irvine
 */
public class A016832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016832() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {256, 1679616, 100000000, 1475789056, 11019960576L, 54875873536L, 208827064576L, 656100000000L, 1785793904896L});
  }
}
