package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002379;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A067394 Number of distinct prime factors in floor((3/2)^n).
 * @author Sean A. Irvine
 */
public class A067394 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A067394() {
    super(1, new A002379().skip(), k -> Z.valueOf(Functions.OMEGA.i(k)));
  }
}
