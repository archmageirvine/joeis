package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017216 <code>a(n) = (9*n + 4)^8</code>.
 * @author Sean A. Irvine
 */
public class A017216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017216() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {65536, 815730721, 54875873536L, 852891037441L, 6553600000000L, 33232930569601L, 128063081718016L, 406067677556641L, 1113034787454976L});
  }
}
