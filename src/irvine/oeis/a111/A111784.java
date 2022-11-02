package irvine.oeis.a111;

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A111784 Eleventh column (m=10) of unsigned triangle A111595.
 * @author Georg Fischer
 */
public class A111784 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A111784() {
    super(10, "[[0],[-1, 1],[10],[10,-1]]", "1", 0);
    setGfType(1);
  }
}
