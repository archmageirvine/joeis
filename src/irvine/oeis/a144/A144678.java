package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144678 Related to enumeration of quantum states (see reference for precise <code>definition)</code>.
 * @author Sean A. Irvine
 */
public class A144678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144678() {
    super(new long[] {-1, 2, -1, 0, 2, -4, 2, 0, -1, 2}, new long[] {1, 2, 3, 4, 7, 10, 13, 16, 22, 28});
  }
}
