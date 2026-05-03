package irvine.oeis.a394;

import irvine.oeis.a002.A002496;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A394683 allocated for Steven Lee Benjamin.
 * @author Sean A. Irvine
 */
public class A394683 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A394683() {
    super(1, new A002496(), k -> k.pow(3).subtract(k.square()).add(1));
  }
}
