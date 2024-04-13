package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066098 Sum of digits of primorial(n) (A002110).
 * @author Sean A. Irvine
 */
public class A066098 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066098() {
    super(1, new A002110().skip(), k -> Z.valueOf(Functions.DIGIT_SUM.l(k)));
  }
}
