package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.a007.A007318;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A070049.
 * @author Sean A. Irvine
 */
public class A074589 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A074589() {
    super(0, new A007318(), Functions.PRIME::z);
  }
}
