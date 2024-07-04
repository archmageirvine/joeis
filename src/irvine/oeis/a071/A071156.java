package irvine.oeis.a071;

import irvine.oeis.PrependSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071153.
 * @author Sean A. Irvine
 */
public class A071156 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071156() {
    super(0, new PrependSequence(new A071158(), 0), A071155::factorialBaseToZ);
  }
}
