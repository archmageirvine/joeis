package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.WolframAutomata;

/**
 * A245549.
 * @author Sean A. Irvine
 */
public class A245549 extends WolframAutomata {

  /** Construct the sequence. */
  public A245549() {
    super(30);
  }

  @Override
  public Z next() {
    return new Z(new StringBuilder(super.next().toString(2)).reverse());
  }
}
