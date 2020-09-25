package irvine.oeis.a032;

import irvine.oeis.PrependSequence;
import irvine.oeis.WeighTransformSequence;

/**
 * A032178 Functions of n points with no fixed points and with no symmetries.
 * @author Sean A. Irvine
 */
public class A032178 extends WeighTransformSequence {

  /** Construct the sequence. */
  public A032178() {
    super(new PrependSequence(new A032177(), 0));
    next();
  }
}
