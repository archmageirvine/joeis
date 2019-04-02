package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291889 Number of symmetrically unique Dyck paths of semilength n and height five.
 * @author Sean A. Irvine
 */
public class A291889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291889() {
    super(new long[] {-9, 84, -240, 224, 66, -234, 113, 20, -33, 10}, new long[] {1, 5, 29, 127, 540, 2117, 8063, 29688, 107237, 380549});
  }
}
