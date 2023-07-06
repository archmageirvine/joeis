package irvine.oeis.a261;
// manually etman at 2023-02-06 12:43

import irvine.oeis.a000.A000142;
import irvine.oeis.transform.EulerTransform;

/**
 * A261047 Euler transform of (n+1)!.
 * @author Georg Fischer
 */
public class A261047 extends EulerTransform {

  /** Construct the sequence. */
  public A261047() {
    super(0, new A000142().skip(2), 1);
  }
}
