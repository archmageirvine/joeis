package irvine.oeis.a034;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.SkipSequence;

/**
 * A034042 Numbers that are primitively or imprimitively represented by (x^2+xy+2y^2, x&gt;=0, y&gt;=0), but not both.
 * @author Sean A. Irvine
 */
public class A034042 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A034042() {
    super(new SkipSequence(new A034036(), 1), new A034041());
  }
}
