package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a061.A061233;

/**
 * A014014 Alternating Engel expansion of Pi.
 * @author Sean A. Irvine
 */
public class A014014 extends PrependSequence {

  /** Construct the sequence. */
  public A014014() {
    super(new A061233().skip(1), Z.THREE);
  }
}
