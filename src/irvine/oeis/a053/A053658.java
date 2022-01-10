package irvine.oeis.a053;

import irvine.math.group.GaloisField;

/**
 * A053658 Number of nonisomorphic cyclic subgroups of general linear group GL(n,3).
 * @author Sean A. Irvine
 */
public class A053658 extends A053651 {

  /** Construct the sequence. */
  public A053658() {
    super(new GaloisField(3));
  }
}
