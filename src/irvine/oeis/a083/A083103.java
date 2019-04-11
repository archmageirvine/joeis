package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A083103 Second-order linear recurrence sequence with <code>a(n) = a(n-1) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A083103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083103() {
    super(new long[] {1, 1},
      new Z[] {
        new Z("1786772701928802632268715130455793"),
        new Z("1059683225053915111058165141686995")
    });
  }
}
