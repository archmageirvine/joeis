package irvine.oeis.a034;

import irvine.oeis.UnionSequence;

/**
 * A034034 Numbers that are primitively or imprimitively represented by x^2+2y^2, but not both.
 * @author Sean A. Irvine
 */
public class A034034 extends UnionSequence {

  /** Construct the sequence. */
  public A034034() {
    super(new A034031(), new A034032());
  }
}
