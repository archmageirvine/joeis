package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016821.
 * @author Sean A. Irvine
 */
public class A016821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016821() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 1953125, 387420489, 10604499373L, 118587876497L, 794280046581L, 3814697265625L, 14507145975869L, 46411484401953L, 129961739795077L});
  }
}
