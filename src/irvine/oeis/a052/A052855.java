package irvine.oeis.a052;

import irvine.oeis.EulerTransform;
import irvine.oeis.SkipSequence;
import irvine.oeis.a036.A036249;

/**
 * A052855 Number of forests of rooted trees of nonempty sets with n points. (Each node is a set of 1 or more points.)
 * @author Georg Fischer
 */
public class A052855 extends EulerTransform {

  /** Construct the sequence. */
  public A052855() {
    super(new SkipSequence(new A036249(), 1), 1);
  }

}
