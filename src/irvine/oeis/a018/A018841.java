package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;
import irvine.oeis.PrependSequence;

/**
 * A018840.
 * @author Sean A. Irvine
 */
public class A018841 extends PrependSequence {

  /** Construct the sequence. */
  public A018841() {
    super(new LinearRecurrence(new long[] {-1, 1, 0, 0, 0, 1},
        new long[] {6, 6, 6, 8, 6, 8}),
      0, 2, 4, 6, 4, 2, 4, 6, 6, 6, 4);
  }
}
