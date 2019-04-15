package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027766 <code>(n+1)*C(n+1,6)</code>.
 * @author Sean A. Irvine
 */
public class A027766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027766() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {6, 49, 224, 756, 2100, 5082, 11088, 22308});
  }
}
