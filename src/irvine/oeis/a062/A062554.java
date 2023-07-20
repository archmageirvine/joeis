package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.closure.MultiplicativeClosureSequence;

/**
 * A062554 Products of numbers of faces of Platonic solids, i.e., of {4,6,8,12,20}.
 * @author Sean A. Irvine
 */
public class A062554 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A062554() {
    super(new FiniteSequence(4, 6, 8, 12, 20));
    setOffset(1);
    add(Z.ONE);
  }
}

