package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007097;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071682 Least m such that A060207(m) = n.
 * @author Sean A. Irvine
 */
public class A071682 extends PrependSequence {

  /** Construct the sequence. */
  public A071682() {
    super(2, new SimpleTransformSequence(2, new A007097(), k -> Functions.DIGIT_LENGTH.z(2, k)).skip(2), 0, 1);
  }
}
