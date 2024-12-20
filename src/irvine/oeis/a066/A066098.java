package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.oeis.a002.A002110;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066098 Sum of digits of primorial(n).
 * @author Sean A. Irvine
 */
public class A066098 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066098() {
    super(0, new A002110(), k -> Functions.DIGIT_SUM.z(k));
  }
}
