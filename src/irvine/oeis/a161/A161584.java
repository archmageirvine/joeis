package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161584 The list of the k values in the common solutions to the 2 equations <code>13*k+1=A^2, 17*k+1=B^2</code>.
 * @author Sean A. Irvine
 */
public class A161584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161584() {
    super(new long[] {1, -224, 224}, new long[] {0, 15, 3360});
  }
}
