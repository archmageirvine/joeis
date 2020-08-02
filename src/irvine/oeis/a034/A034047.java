package irvine.oeis.a034;

import irvine.oeis.UnionSequence;

/**
 * A034047 Numbers that are primitively or imprimitively represented by <code>x^2+y^2+z^2</code>, but not both.
 * @author Sean A. Irvine
 */
public class A034047 extends UnionSequence {

  /** Construct the sequence. */
  public A034047() {
    super(new A034044(), new A034045());
  }
}
