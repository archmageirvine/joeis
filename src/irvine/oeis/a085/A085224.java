package irvine.oeis.a085;

import irvine.oeis.a014.A014486;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085224 A014486-encodings of the plane general trees whose rightmost subtree (branching from the root) is just a stick: /.
 * @author Sean A. Irvine
 */
public class A085224 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085224() {
    super(0, new A014486(), k -> k.multiply(4).add(2));
  }
}
