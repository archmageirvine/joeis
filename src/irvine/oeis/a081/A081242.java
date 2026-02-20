package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.oeis.a007.A007931;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A081242 Left-to-right binary enumeration.
 * @author Sean A. Irvine
 */
public class A081242 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A081242() {
    super(2, new A007931(), k -> Functions.REVERSE.z(k));
  }
}
