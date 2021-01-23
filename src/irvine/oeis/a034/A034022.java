package irvine.oeis.a034;

import irvine.oeis.UnionSequence;

/**
 * A034022 Numbers that are primitively or imprimitively represented by x^2+xy+y^2, but not both.
 * @author Sean A. Irvine
 */
public class A034022 extends UnionSequence {

  /** Construct the sequence. */
  public A034022() {
    super(new A034021(), new A034018());
  }
}

