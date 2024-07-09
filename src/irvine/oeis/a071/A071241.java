package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.oeis.a014.A014263;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071241 Arithmetic mean of k and R(k) where k is the n-th nonnegative number using only even digits and R(k) is its digit reversal (A004086).
 * @author Sean A. Irvine
 */
public class A071241 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071241() {
    super(1, new A014263(), k -> Functions.REVERSE.z(k).add(k).divide2());
  }
}
