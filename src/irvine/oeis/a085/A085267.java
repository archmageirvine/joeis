package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A085267 Numbers having at least two representations as sum of a squarefree number and a nonzero square.
 * @author Sean A. Irvine
 */
public class A085267 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A085267() {
    super(1, new A085263(), k -> k.compareTo(Z.TWO) >= 0);
  }
}
