package irvine.oeis.a077;
// manually insect/insect2 at 2022-02-22 19:20

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a005.A005117;
import irvine.oeis.a217.A217394;

/**
 * A077678 Squarefree numbers beginning with 2.
 * @author Georg Fischer
 */
public class A077678 extends IntersectionSequence {

  /** Construct the sequence. */
  public A077678() {
    super(new A005117(), new A217394());
  }
}
