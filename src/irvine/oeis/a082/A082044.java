package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082044 Main diagonal of <code>A082043</code>.
 * @author Sean A. Irvine
 */
public class A082044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082044() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 4, 25, 100, 289});
  }
}
