package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.oeis.a014.A014261;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071240 Arithmetic mean of k and R(k) where k is a number using only odd digits and R(k) is its digit reversal (A004086).
 * @author Sean A. Irvine
 */
public class A071240 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071240() {
    super(0, new A014261(), k -> Functions.REVERSE.z(k).add(k).divide2());
  }
}
