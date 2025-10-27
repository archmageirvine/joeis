package irvine.oeis.a389;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a369.A369361;
import irvine.oeis.a386.A386762;

/**
 * A389695 Powers k^m, m &gt; 1, where k is neither squarefree, squareful, nor a product of primorials.
 * @author Sean A. Irvine
 */
public class A389695 extends IntersectionSequence {

  /** Construct the sequence. */
  public A389695() {
    super(1, new A386762(), new A369361());
  }
}

