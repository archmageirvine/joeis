package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157843 <code>1728000n - 1343760</code>.
 * @author Sean A. Irvine
 */
public class A157843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157843() {
    super(new long[] {-1, 2}, new long[] {384240, 2112240});
  }
}
