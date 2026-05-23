package irvine.oeis.a084;

import irvine.oeis.InverseSequence;
import irvine.oeis.a058.A058033;

/**
 * A084972 When A058033 first reaches n.
 * @author Sean A. Irvine
 */
public class A084972 extends InverseSequence {

  /** Construct the sequence. */
  public A084972() {
    super(1, new A058033());
  }
}
