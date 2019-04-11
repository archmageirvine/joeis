package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016916 <code>a(n) = (6n)^8</code>.
 * @author Sean A. Irvine
 */
public class A016916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016916() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1679616, 429981696, 11019960576L, 110075314176L, 656100000000L, 2821109907456L, 9682651996416L, 28179280429056L});
  }
}
