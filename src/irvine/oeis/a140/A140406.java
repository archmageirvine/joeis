package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140406 a(n) = binomial(n+6, 6)*8^n.
 * @author Sean A. Irvine
 */
public class A140406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140406() {
    super(new long[] {2097152, -1835008, 688128, -143360, 17920, -1344, 56}, new long[] {1, 56, 1792, 43008, 860160, 15138816, 242221056});
  }
}
