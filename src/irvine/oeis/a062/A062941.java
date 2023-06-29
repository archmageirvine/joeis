package irvine.oeis.a062;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a181.A181354;

/**
 * A062941 Number of n-digit cubes (0 is included as a single-digit number).
 * @author Sean A. Irvine
 */
public class A062941 extends PrependSequence {

  /** Construct the sequence. */
  public A062941() {
    super(1, new SkipSequence(new A181354(), 1), 3);
  }
}

