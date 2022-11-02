package irvine.oeis.a111;

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A111778 Fifth column (m=4) of unsigned triangle A111595.
 * @author Georg Fischer
 */
public class A111778 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A111778() {
    super(4, "[[0],[-1, 1],[4],[4,-1]]", "1", 0);
    setGfType(1);
  }
}
