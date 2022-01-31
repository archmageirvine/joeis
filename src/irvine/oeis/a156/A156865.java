package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156865 a(n) = 729000*n - 612180.
 * @author Sean A. Irvine
 */
public class A156865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156865() {
    super(new long[] {-1, 2}, new long[] {116820, 845820});
  }
}
