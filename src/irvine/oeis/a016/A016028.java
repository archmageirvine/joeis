package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;
import irvine.oeis.PrependSequence;

/**
 * A016028 Expansion of <code>(1 - x + x^4) / (1 - x)^3</code>.
 * @author Sean A. Irvine
 */
public class A016028 extends PrependSequence {

  /** Construct the sequence. */
  public A016028() {
    super(new LinearRecurrence(new long[] {1, -3, 3}, new long[] {3, 4, 6}), Z.ONE, Z.TWO);
  }
}
