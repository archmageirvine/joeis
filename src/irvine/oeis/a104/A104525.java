package irvine.oeis.a104;
// manually euleras at 2021-11-23 09:22

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.SkipSequence;
import irvine.oeis.a055.A055887;

/**
 * A104525 The number of hierarchical orderings among the parts of the integer partitions of the integer n.
 * @author Georg Fischer
 */
public class A104525 extends EulerTransform {

  /** Construct the sequence. */
  public A104525() {
    super(new SkipSequence(new A055887(), 1));
  }
}
